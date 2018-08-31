package com.hackerrank.solutions.factorypatternsolution.creator;

import com.hackerrank.solutions.factorypatternsolution.product.Cake;
import com.hackerrank.solutions.factorypatternsolution.product.Food;
import com.hackerrank.solutions.factorypatternsolution.product.Pizza;

public class FoodFactory {

	public Food getFood(String food) {
		if (food.equals("cake")) {
			return new Cake();
		} else if (food.equals("pizza")) {
			return new Pizza();
		} else {
			return null;
		}
	}
}
