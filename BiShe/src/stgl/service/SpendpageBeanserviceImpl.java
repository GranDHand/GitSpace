package stgl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.PageBean;
import stgl.domain.Stgl_Invcice;
import stgl.mapper.IncomeAndSpendeMapper;

@Service
public class SpendpageBeanserviceImpl implements SpendpageBeanService{
	
	@Autowired
	private IncomeAndSpendeMapper iasMapper;
	
	@Override
	public PageBean<Stgl_Invcice> findAllSpend(String inv_status,int pageNum, int pageSize) {
		// TODO Auto-generated method stub
				System.out.println(inv_status);
				List<Stgl_Invcice> list = iasMapper.incomeAndSpend(inv_status);
				//活动总页数
				int totalRecord  = list.size();
				System.out.println("当前页数："+pageNum);
				//得到这三个属性后创建PageBean对象
				PageBean pb = new PageBean<>(pageNum, pageSize, totalRecord);
				
				System.out.println(pb);
				
				//然后获取PageBean中的startIndex
				int startIndex = pb.getStartIndex();
				System.out.println("startIndex"+startIndex);
				System.out.println("这是支出的list"+iasMapper.pagingAllAss(inv_status,startIndex, pageSize));
				
				pb.setList(iasMapper.pagingAllAss(inv_status,startIndex, pageSize));
				return pb;
			}
}
