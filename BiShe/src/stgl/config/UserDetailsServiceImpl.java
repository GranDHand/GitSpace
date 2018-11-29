package stgl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import stgl.domain.Stgl_Stu;
import stgl.service.FindStuService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private FindStuService findStuService;
	// 当spring security需要用户详情时调用此方法，传入用户名（就是学号）
	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		
		System.out.println("loadUserByUsername: " + username);
		
//		System.out.println("--- 12014050701006: " + passwordEncoder.encode("12014050701006"));
		
		
		Stgl_Stu stu = findStuService.findStu(username);
//		System.out.println("findStuService.findStu(StuNo):"+stu);
		
			if(stu.getStu_username()!=null){
				if(stu.getStu_type()!=null){
					return new User(stu.getStu_username(),stu.getStu_password(),stu.getStu_type().toUpperCase());
				}else{
					return new User(stu.getStu_username(),stu.getStu_password(),stu.getStu_type().toUpperCase());
				}
			}else{
				throw new UsernameNotFoundException(username + "不存在");
			}
	}
  }

