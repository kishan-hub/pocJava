package com.demo.stream;


public class Project {

	private String name;
	
	private String language;
	
	private Integer stars;
	
	private String description;
	
	private String author;
	
	private String forks;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getStars() {
		return stars;
	}

	public void setStars(Integer stars) {
		this.stars = stars;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getForks() {
		return forks;
	}

	public void setForks(String forks) {
		this.forks = forks;
	}

	public Project(String name, String language, Integer stars, String description, String author, String forks) {
		this.name = name;
		this.language = language;
		this.stars = stars;
		this.description = description;
		this.author = author;
		this.forks = forks;
	}
	@Override
	public String toString() {
		return "Project [name=" + name + ", language=" + language + ", stars=" + stars + ", description=" + description
				+ ", author=" + author + ", forks=" + forks + "]";
	}

}
