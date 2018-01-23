package com.ts.us.dto;

import java.util.List;

public class Recipe {
	private int id;
	private String name;
    private String description;
    private String cuisine_id;
    private int is_veg;
    private float price;
    private String image;
    List<FeedBack> FeedBacklist;
    
public Recipe(){
	System.out.println("Object is created");
   }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getCuisine_id() {
	return cuisine_id;
}

public void setCuisine_id(String cuisine_id) {
	this.cuisine_id = cuisine_id;
}

public int getIs_veg() {
	return is_veg;
}

public void setIs_veg(int is_veg) {
	this.is_veg = is_veg;
}

@Override
public String toString() {
	return "RecipeDTO [id=" + id + ", name=" + name + ", description=" + description + ", cuisine_id=" + cuisine_id
			+ ", is_veg=" + is_veg + "]";
}

}
