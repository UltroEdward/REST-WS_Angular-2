package com.measqa.entity.portfolio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "projects")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Project {

	private int id;
	private String name;
	private String webSite;
	private String startDate;
	private String endDate;
	private String role;

	private String descriptionShort;
	private String descriptionFull;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PROJECTS_ID", unique = true, nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "WEB_SITE", unique = true, nullable = false, length = 10)
	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	@Column(name = "NAME", unique = true, nullable = false, length = 100)
	public String getName() {
		return name;
	}

	public void setName(String projectName) {
		this.name = projectName;
	}

	@Column(name = "START_DATE", unique = true, nullable = false, length = 10)
	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@Column(name = "END_DATE", unique = true, nullable = false, length = 10)
	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Column(name = "DESCRIPTION_BRIEF", unique = true, nullable = false, length = 10)
	public String getDescriptionShort() {
		return descriptionShort;
	}

	public void setDescriptionShort(String descriptionShort) {
		this.descriptionShort = descriptionShort;
	}

	@Column(name = "DESCRIPTION_FULL", unique = true, nullable = false, length = 10)
	public String getDescriptionFull() {
		return descriptionFull;
	}

	public void setDescriptionFull(String descriptionFull) {
		this.descriptionFull = descriptionFull;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
