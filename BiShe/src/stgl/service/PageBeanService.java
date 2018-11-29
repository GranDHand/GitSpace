package stgl.service;

import stgl.domain.PageBean;
import stgl.domain.Stgl_Association;
public interface PageBeanService{
	public PageBean<Stgl_Association> findAllAss(int pageNum,int pageSize);
}
