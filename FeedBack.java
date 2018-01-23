package com.ts.us.dto;

import java.sql.*;

public class FeedBack {

	private int id;
	private Date feedback_date;
	private Date visited_date;
	private String comments;
	private int rating;
	
	private FeedBackType feedBackType;
	private User user;
	private Branch branch;
	private Recipe recipe;
	
	public FeedBackType getFeedBackType() {
		return feedBackType;
	}

	public void setFeedBackType(FeedBackType feedBackType) {
		this.feedBackType = feedBackType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public FeedBack(){
		System.out.println("** Feedback object is created **");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFeedback_date() {
		return feedback_date;
	}

	public void setFeedback_date(Date feedback_date) {
		this.feedback_date = feedback_date;
	}

	public Date getVisited_date() {
		return visited_date;
	}

	public void setVisited_date(Date visited_date) {
		this.visited_date = visited_date;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "FeedBackDTO [id=" + id + ", feedback_date=" + feedback_date + ", visited_date=" + visited_date
				+ ", comments=" + comments + ", rating=" + rating + ", feedBackType=" + feedBackType + ", user=" + user
				+ ", branch=" + branch + ", recipe=" + recipe + "]";
	}
	
}
