package com.measqa.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
	public Response getAllCompanies() {
		 Response response = Response.status(200).entity(factory.getCompanyDao().getAllCompamies()).header("Access-Control-Allow-Origin", "*").build();
		 return response;
		
	}
	//Access-Control-Allow-Origin: http://localhost:3000
}
