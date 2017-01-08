package com.measqa.dao.interfaces;

import java.util.List;

import com.measqa.entity.Company;

public interface CompanyDao {

	Company getCompany(int id);
	List<Company> getAllCompamies();
}
