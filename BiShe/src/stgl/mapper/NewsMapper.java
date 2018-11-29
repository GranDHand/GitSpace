package stgl.mapper;

import java.util.List;

import stgl.domain.Stgl_News;

public interface NewsMapper {
	
	List<Stgl_News> findAllNewMapper();
	List<Stgl_News> findTypeNewMapper(String n_status);
}
