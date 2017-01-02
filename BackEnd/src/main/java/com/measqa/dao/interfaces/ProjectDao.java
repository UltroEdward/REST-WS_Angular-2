package com.measqa.dao.interfaces;

import java.util.List;

import com.measqa.entity.portfolio.Project;

public interface ProjectDao {

	Project getProject(int id);

	List<Project> getAllProjects();
}
