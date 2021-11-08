package com.devsuperior.movieflix.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String text;

	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Review() {
	}

	public Review(Long id, String text, Movie movie, User user) {
		this.id = id;
		this.text = text;
		this.movie = movie;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}
}
