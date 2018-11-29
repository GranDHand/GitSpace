package stgl.mapper;

import java.util.List;

import stgl.domain.Stgl_Apply;
import stgl.domain.Stgl_Stu;

public interface ApplyMapper {
	public List<Stgl_Apply> myApply(String username);
	public Stgl_Stu selectApplyName(String username);
}
