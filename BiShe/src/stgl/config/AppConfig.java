package stgl.config;


import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.web.authentication.RememberMeServices;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration 
@ComponentScan("stgl")  
@EnableWebMvc  //静态资源、json、校验等支持
@MapperScan("stgl.mapper") //自动扫描Mapper
@PropertySource("classpath:jdbc.properties")  //加载静态资源
@EnableTransactionManagement
public class AppConfig extends WebMvcConfigurerAdapter{
	
	
	@Bean   //使用SqlSessionFactoryBean 生成SessionFactory
	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));//加入mybatis配置
		factoryBean.setDataSource(dataSource);//设置数据源
		return factoryBean; 
	}
	
	@Bean   //开启事物管理 
	public PlatformTransactionManager transactionManager(DataSource dataSource){
		//事务管理组件,进行事务管理的xml配置
		DataSourceTransactionManager dstm = new DataSourceTransactionManager(); 
		dstm.setDataSource(dataSource);
		return dstm;
	}
	
	@Bean // 负责将控制器方法返回的字符串映射到某个JSP
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class); // 支持jsp及标准taglib
		viewResolver.setPrefix("/public/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	@Bean    //数据源
	public DataSource dataSource(Environment env){
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		ds.setUrl(env.getProperty("jdbc.url"));
		ds.setUsername(env.getProperty("jdbc.username"));
		ds.setPassword(env.getProperty("jdbc.password"));
		return ds;
	}
	
	@Override  //访问静态资源  
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// /assets/css/app.css -> /WebContent/public/css/app.css
		// /assets/js/app.js -> /WebContent/public/js/app.js
		// /WebContent/public/
		registry.addResourceHandler("/assets/**").addResourceLocations("/public/");
	}
	
	@Bean   
	public RestTemplate restTemolate(){
		// 使用apache hc HttpClient库来负责底层请求发送
		ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		RestTemplate rs = new RestTemplate(requestFactory);
		//类型转换器   其中？代表不在意是什么类型    
		List<HttpMessageConverter<?>> messageConverters = Arrays.asList(
				//转换成json类型
				new MappingJackson2HttpMessageConverter()
		);
		rs.setMessageConverters(messageConverters);
		return rs;
	}
	
	@Bean
	public MultipartResolver multipartResolver() { //名字必须是这个作为bean名字
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		multipartResolver.setMaxUploadSize(30 * 1024 * 1024); // bytesΪ��λ���˴�Ϊ30M
		return multipartResolver;
	}
	

}
