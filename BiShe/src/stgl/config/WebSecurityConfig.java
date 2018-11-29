package stgl.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@EnableWebSecurity  // 开启web security支持：应用bean容器里的WebSecurityConfigurer
@EnableGlobalMethodSecurity(securedEnabled = true,prePostEnabled=true) 
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	 @Bean
	    @Override
	    protected AuthenticationManager authenticationManager() throws Exception {
	        return super.authenticationManager();
	    }
	
	@Autowired
	private  UserDetailsService userDetailsService;


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/public/**").permitAll()  //允许静态资源加载
			.antMatchers("/login").permitAll()  //允许"/login"加载
//			.antMatchers("/admin/employee").fullyAuthenticated()
//			.antMatchers("/admin/**").hasRole("ADMIN") //在/admin/路径下  只允许角色为ADMIN的用户进入
			.antMatchers("/**").authenticated().and() // 注意地址匹配顺序(从上往下)：越具体的放上面，否则下面的没有机会匹配
			.formLogin()
			.loginPage("/login").and()			//自定义登录界面
			.rememberMe()
			.userDetailsService(userDetailsService)// 开启remember me支持
			.tokenValiditySeconds(7 * 3600*3600) // 记住7天
			;
	}

	
	@Override
    public void configure(WebSecurity web) throws Exception {
        //解决静态资源被拦截的问题
        web.ignoring().antMatchers("/public/**");
    }
	
	
	
	//密码加密后 会自动校验  
	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
}
