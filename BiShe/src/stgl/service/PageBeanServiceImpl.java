package stgl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.PageBean;
import stgl.domain.Stgl_Association;
import stgl.mapper.FindAllAssoictionMapper;

@Service
public class PageBeanServiceImpl implements PageBeanService{

	@Autowired
	private FindAllAssoictionMapper faaMapper;
	
	@Override
	public PageBean<Stgl_Association> findAllAss(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		List<Stgl_Association> list = faaMapper.findAllAss();
		//活动总页数
		int totalRecord  = list.size();
		//得到这三个属性后创建PageBean对象
		PageBean pb = new PageBean<>(pageNum, pageSize, totalRecord);
		
		//然后获取PageBean中的startIndex
		int startIndex = pb.getStartIndex();
		
		pb.setList(faaMapper.pagingAllAss(startIndex, pageSize));
		return pb;
	}
}
