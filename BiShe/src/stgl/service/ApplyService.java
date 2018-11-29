package stgl.service;

import java.util.List;

import stgl.domain.Stgl_Apply;
import stgl.domain.Stgl_Stu;

public interface ApplyService {
	
	public List<Stgl_Apply> myApplyService(String username);
	
	public Stgl_Stu ApplyNameService(String username);
}
