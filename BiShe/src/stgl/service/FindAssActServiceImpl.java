package stgl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.PageBean;
import stgl.domain.Stgl_Ass_Activity;
import stgl.mapper.AssHonorMapper;
import stgl.mapper.FindAssActMapper;

@Service
public class FindAssActServiceImpl implements FindAssActService {
	
	@Autowired
	private FindAssActMapper findAssAct;
	
	@Autowired
	private AssHonorMapper assHonorMapper;
	

	@Override
	public PageBean<Stgl_Ass_Activity> assActivityService(String ass_id, int pageNum, int pageSize) {
		
		System.out.println("从controller哪里接收的："+ass_id);
		List<Stgl_Ass_Activity> list = findAssAct.findAllAct(ass_id);
		//活动总页数
		int totalRecord  = list.size();
		System.out.println("当前页数："+totalRecord);
		//得到这三个属性后创建PageBean对象
		PageBean pb = new PageBean<>(pageNum, pageSize, totalRecord);
		
		System.out.println(pb);
		
		//然后获取PageBean中的startIndex
		int startIndex = pb.getStartIndex();
		System.out.println("startIndex"+startIndex);
		System.out.println("这是list"+findAssAct.assActivity(ass_id, startIndex, pageSize));
		
		pb.setList(findAssAct.assActivity(ass_id, startIndex, pageSize));
		return pb;
	}

}
