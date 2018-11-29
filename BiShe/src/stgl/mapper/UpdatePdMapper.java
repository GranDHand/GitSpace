package stgl.mapper;

import org.apache.ibatis.annotations.Param;

public interface UpdatePdMapper {
	
		public void updatePd(@Param("stu_username")String stu_username,@Param("stu_password")String password);
		public String selectUsername(String stu_username);
}
