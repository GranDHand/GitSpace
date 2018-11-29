package stgl.service;

import java.util.List;

import stgl.domain.Stgl_Invcice;

public interface IncomeAndSpendService {
	List<Stgl_Invcice> incomeAndSpendService(String inv_status);
}
