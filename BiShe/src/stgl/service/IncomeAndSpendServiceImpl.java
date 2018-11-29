package stgl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stgl.domain.Stgl_Invcice;
import stgl.mapper.IncomeAndSpendeMapper;

@Service
public class IncomeAndSpendServiceImpl implements IncomeAndSpendService {
	
	@Autowired
	private IncomeAndSpendeMapper iasMapper;
	
	@Override
	public List<Stgl_Invcice> incomeAndSpendService(String inv_status) {
		// TODO Auto-generated method stub
		
		return iasMapper.incomeAndSpend(inv_status);
	}

}
