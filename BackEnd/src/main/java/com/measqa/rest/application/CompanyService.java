package com.measqa.rest.application;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.measqa.entity.Company;
import com.measqa.rest.BaseService;
import com.measqa.utils.JerseyUtils;

@Path("/companies")
public class CompanyService extends BaseService {

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Company getCompany(@PathParam("id") int id) {
		return factory.getCompanyDao().getCompany(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Company> getAllCompanies(@Context UriInfo uriInfo) {
		return factory.getCompanyDao().getAllCompamies(JerseyUtils.getValueFromRequest(uriInfo,"size", 10), JerseyUtils.getValueFromRequest(uriInfo,"page-number", 1));
	}
}
