package com.measqa.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.measqa.entity.portfolio.Company;

@Path("/companies")
public class CompanyService extends BaseService {

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Company getCompany(@PathParam("id") int id) {
		return factory.getCompanyDao().getCompany(id);

	}
	
	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Company> getAllCompanies() {
		return factory.getCompanyDao().getAllCompamies();
	}
}
