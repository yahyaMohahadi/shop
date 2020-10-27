package org.maktab.market.data.retrofit.respone;

import com.google.gson.annotations.SerializedName;

public class CategoriesItem{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("slug")
	private String slug;

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public String getSlug(){
		return slug;
	}
}