package stgl.service;

import stgl.domain.PageBean;
import stgl.domain.Stgl_Invcice;

public interface SpendpageBeanService {
	public PageBean<Stgl_Invcice> findAllSpend(String inv_status,int pageNum,int pageSize);
}
