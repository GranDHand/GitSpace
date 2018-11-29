package stgl.service;

import java.util.List;

import stgl.domain.Stgl_News;

public interface FindTypeNewsService {
	List<Stgl_News> findTypeNew(String n_status);
}
