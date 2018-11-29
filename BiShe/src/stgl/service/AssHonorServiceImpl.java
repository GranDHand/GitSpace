package stgl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.PageBean;
import stgl.domain.Stgl_Ass_Honor;
import stgl.mapper.AssHonorMapper;

@Service
public class AssHonorServiceImpl implements AssHonorService {

	@Autowired
	private AssHonorMapper assHonorMapper;
	
	@Override
	public PageBean<Stgl_Ass_Honor> assHonorService(String ass_id,int pageNum,int pageSize) {
		List<Stgl_Ass_Honor> list = assHonorMapper.findAllHonor(ass_id);
		//活动总页数
		int totalRecord  = list.size();
		System.out.println("当前页数："+pageNum);
		//得到这三个属性后创建PageBean对象
		PageBean pb = new PageBean<>(pageNum, pageSize, totalRecord);
		
		System.out.println(pb);
		
		//然后获取PageBean中的startIndex
		int startIndex = pb.getStartIndex();
		System.out.println("startIndex"+startIndex);
		System.out.println("这是list"+assHonorMapper.assHonor(ass_id, startIndex, pageSize));
		
		pb.setList(assHonorMapper.assHonor(ass_id, startIndex, pageSize));
		return pb;
	}

	@Override
	public String findAss_IdService(String stu_username) {
		// TODO Auto-generated method stub
		return assHonorMapper.findAssId(stu_username);
	}

}
