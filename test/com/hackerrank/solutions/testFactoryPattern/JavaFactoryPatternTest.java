package com.hackerrank.solutions.testFactoryPattern;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.hackerrank.solutions.factorypatternsolution.creator.FoodFactory;
import com.hackerrank.solutions.factorypatternsolution.product.Food;

public class JavaFactoryPatternTest {
	
	
	String food = "cake";
		
	@Test
	public void testFoodFactory() {
		//Steps
			//F
		FoodFactory factory = new FoodFactory();
		Food result = factory.getFood(food);
		
		assertThat(result.getType(), is("cake"));
	}
}
