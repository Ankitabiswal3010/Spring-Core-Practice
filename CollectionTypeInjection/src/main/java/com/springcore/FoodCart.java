package com.springcore;

import java.util.List;

public class FoodCart 
{
	private List<String>dishName;

	public FoodCart() {
		super();
	}

	public List<String> getDishName() {
		return dishName;
	}

	public void setDishName(List<String> dishName) {
		this.dishName = dishName;
	}

	@Override
	public String toString() {
		return "FoodCart [dishName=" + dishName + "]";
	}
	
	

}
