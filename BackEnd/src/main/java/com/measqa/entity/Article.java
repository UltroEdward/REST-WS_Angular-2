package com.measqa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "ARTICLES")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Article {

	private int id;
	private String name;
	private String pathToMainPic;
	private String shortDescription;
	private String fullDescription;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ARTICLE_ID", unique = true, nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "NAME", unique = true, nullable = false, length = 10)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PATH_TO_PIC", unique = true, nullable = false, length = 10)
	public String getPathToMainPic() {
		return pathToMainPic;
	}

	public void setPathToMainPic(String pathToMainPic) {
		this.pathToMainPic = pathToMainPic;
	}

	@Column(name = "DESCRIPTION_SHORT", unique = true, nullable = false, length = 10)
	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	@Column(name = "DESCRIPTION_FULL", unique = true, nullable = false, length = 10)
	public String getFullDescription() {
		return fullDescription;
	}

	public void setFullDescription(String fullDescription) {
		this.fullDescription = fullDescription;
	}

}
