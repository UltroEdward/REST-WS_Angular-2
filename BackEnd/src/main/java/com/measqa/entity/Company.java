package com.measqa.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "COMPANIES")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Company {

	private int id;
	private String companyName;
	private String companyImg;
	private String companyUrl;
	private String title;
	private String startDate;
	private String endDate;
	private Set <Project> projects;

	@OneToMany
	@OrderBy("PROJECT_ID ASC")
	@JoinColumn(name = "COMPANY_ID")
	@JsonProperty("projects")
	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COMPANY_ID", unique = true, nullable = false)
	@JsonProperty("id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "NAME", unique = true, nullable = false, length = 10)
	@JsonProperty("name")
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "PATH_TO_PIC", unique = true, nullable = false, length = 10)
	@JsonProperty("logo")
	public String getCompanyImg() {
		return companyImg;
	}

	public void setCompanyImg(String companyImg) {
		this.companyImg = companyImg;
	}

	@Column(name = "URL", unique = true, nullable = false, length = 10)
	@JsonProperty("url")
	public String getCompanyUrl() {
		return companyUrl;
	}

	public void setCompanyUrl(String companyUrl) {
		this.companyUrl = companyUrl;
	}

	@Column(name = "TITLE", unique = true, nullable = false, length = 10)
	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "START_DATE", unique = true, nullable = false, length = 10)
	@JsonProperty("start")
	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@Column(name = "END_DATE", unique = true, nullable = false, length = 10)
	@JsonProperty("end")
	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
