package com.measqa.entity.portfolio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "PROJECTS")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Project {

	private int id;
	private String projectName;
	private String projectWeb;
	private String descriptionShort;
	private String descriptionFull;
	private Company company;

	
	@ManyToOne
	@JoinColumn(name="COMPANY_ID")
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PROJECT_ID", unique = true, nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "NAME", unique = true, nullable = false, length = 10)
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Column(name = "URL", unique = true, nullable = false, length = 10)
	public String getProjectWeb() {
		return projectWeb;
	}

	public void setProjectWeb(String projectWeb) {
		this.projectWeb = projectWeb;
	}

	@Column(name = "PROJECT_BRIEF", unique = true, nullable = false, length = 10)
	public String getDescriptionShort() {
		return descriptionShort;
	}

	public void setDescriptionShort(String descriptionShort) {
		this.descriptionShort = descriptionShort;
	}

	@Column(name = "PROJECT_WORK", unique = true, nullable = false, length = 10)
	public String getDescriptionFull() {
		return descriptionFull;
	}

	public void setDescriptionFull(String descriptionFull) {
		this.descriptionFull = descriptionFull;
	}

}
