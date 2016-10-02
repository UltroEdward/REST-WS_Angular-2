package com.measqa.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.measqa.entity.portfolio.Company;
import com.measqa.entity.portfolio.Project;

@Path("/projects")
public class ProjectService extends BaseService {

	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Project> getAllProjects() {
		return factory.getProjectDao().getAllProjects();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Project getProject(@PathParam("id") int id) {
		return factory.getProjectDao().getProject(id);

	}
	
}
