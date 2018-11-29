package stgl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.PageBean;
import stgl.domain.Stgl_Stu;
import stgl.mapper.FindAllStuMapper;

@Service
public class FindAllStuServiceImpl implements FIndAllStuService {
	
	@Autowired
	private FindAllStuMapper findAllMapper;
	
	@Override
	public PageBean<Stgl_Stu> findAllMember(String stu_username, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		System.out.println(stu_username);
		List<Stgl_Stu> list = findAllMapper.findAllStu(stu_username);
		System.out.println("list"+list);
		//活动总页数
		int totalRecord  = list.size();
		System.out.println("总页数："+totalRecord);
		//得到这三个属性后创建PageBean对象
		PageBean pb = new PageBean<>(pageNum, pageSize, totalRecord);
		
		System.out.println(pb);
		
		//然后获取PageBean中的startIndex
		int startIndex = pb.getStartIndex();
		System.out.println("社团成员startIndex"+startIndex);
		
		System.out.println("这是社团成员的list"+findAllMapper.pagingAllMember(stu_username, pageNum, pageSize));
		pb.setList(findAllMapper.pagingAllMember(stu_username, startIndex, pageSize));
		return pb;
	}

}
