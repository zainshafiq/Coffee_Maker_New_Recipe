/*
 * Name: Muhammad Ishraf Shafiq Zainuddin
 * ID  : 200342741
 * File: myCoffeeMakerTest.java
 * 
 * Reference Author:
 * tdouglas
 */

package ENSE475_Lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyCoffeeMakerTest {
	
	@Test
	public void CoffeeMakerTest() {
		//fail("Not yet implemented");
		
		MyCoffeeMaker coffeeMaker = new MyCoffeeMaker();
		MyInventory inv = coffeeMaker.getInventory();
		assertEquals(20, inv.getCoffee());
		assertEquals(20, inv.getMilk());
		assertEquals(20, inv.getSugar());
		assertEquals(20, inv.getChocolate());
		assertEquals(20, inv.getMarshmallow());
	}
	
	@Test
	public void EditRecipe() {
		fail("Not yet implemented");
		
		MyCoffeeMaker coffeeMaker = new MyCoffeeMaker();
		MyRecipe newCoffeeRecipe;
		
		//Cappuccino
		newCoffeeRecipe = new MyRecipe("cappuccino", 2, 1, 1, 4, 0);
		MyRecipe getCappuccino;
		assertEquals(true, coffeeMaker.addRecipe(newCoffeeRecipe));
		
		//Latte
		newCoffeeRecipe = new MyRecipe("latte", 2, 1, 1, 2, 2);
		MyRecipe getLatte;
		assertEquals(true, coffeeMaker.addRecipe(newCoffeeRecipe));
		
		//Expresso
		newCoffeeRecipe = new MyRecipe("expresso", 2, 1, 1, 0, 0);
		MyRecipe getExpresso;
		assertEquals(true, coffeeMaker.addRecipe(newCoffeeRecipe));
		
		//Mocha
		newCoffeeRecipe = new MyRecipe("mocha", 2, 1, 1, 10, 5);
		MyRecipe getMocha;
		assertEquals(true, coffeeMaker.addRecipe(newCoffeeRecipe));
	}
	
	@Test
	public void AddInventory() {
		fail("Not yet implemented");
		
		MyCoffeeMaker coffeeMaker = new MyCoffeeMaker();
		MyRecipe newRecipe;
		
		//Cappuccino
		newRecipe = new MyRecipe("cappuccino", 2, 1, 1, 4, 0);
		assertEquals(true, coffeeMaker.addRecipe(newRecipe));
		assertNull(coffeeMaker.getRecipe("diabetes"));
		
		//Latte
		newRecipe = new MyRecipe("latte", 2, 1, 1, 2, 2);
		assertEquals(true, coffeeMaker.addRecipe(newRecipe));
		assertNull(coffeeMaker.getRecipe("cappuccino"));
		
		//Expresso
		newRecipe = new MyRecipe("expresso", 2, 1, 1, 0, 0);
		assertEquals(true, coffeeMaker.addRecipe(newRecipe));
		assertNull(coffeeMaker.getRecipe("latte"));
		
		//Mocha
		newRecipe = new MyRecipe("mocha", 2, 1, 1, 10, 5);
		assertEquals(true, coffeeMaker.addRecipe(newRecipe));
		assertNull(coffeeMaker.getRecipe("expresso"));
	}		

	@Test
	public void AddRecipe() {
		fail("Not yet implemented");
		
		MyCoffeeMaker coffeeMaker = new MyCoffeeMaker();
		MyRecipe coffeeRecipe;
		
		//Single/Dark
		coffeeRecipe = new MyRecipe("dark", 2, 1, 1, 0, 0);
		MyRecipe getRecipe;
		assertEquals(true, coffeeMaker.addRecipe(coffeeRecipe));
		
		//Double/Double
		coffeeRecipe = new MyRecipe("double", 2, 2, 2, 0, 0);
		assertEquals(false, coffeeMaker.addRecipe(coffeeRecipe));
		
		//Triple
		coffeeRecipe = new MyRecipe("triple", 2, 3, 3, 0, 0);
		assertEquals(false, coffeeMaker.addRecipe(coffeeRecipe));
		
		//Quadruple/Diabetes
		coffeeRecipe = new MyRecipe("diabetes", 2, 4, 4, 0, 0);
		assertEquals(false, coffeeMaker.addRecipe(coffeeRecipe));
	}

	@Test
	public void GetRecipe() {
		MyCoffeeMaker coffeeMaker = new MyCoffeeMaker();
		MyRecipe coffeeRecipe;
		coffeeRecipe = new MyRecipe("dark", 2, 1, 1, 0, 0);
		assertEquals(true, coffeeMaker.addRecipe(coffeeRecipe));
		assertNull(coffeeMaker.getRecipe("diabetes"));
	}

	@Test
	public void DeleteRecipe() {
			
		MyCoffeeMaker coffeeMaker = new MyCoffeeMaker();
		
		MyRecipe coffeeRecipe;
		coffeeRecipe = new MyRecipe("dark", 2, 1, 1, 0, 0);
		
		//Delete Recipe
		MyRecipe deleteRecipe;
		deleteRecipe = new MyRecipe("dark", 2, 1, 1, 0, 0);
		assertEquals(true, coffeeMaker.addRecipe(coffeeRecipe));
				
		//Check Recipe
		MyRecipe getRecipe;
		getRecipe = coffeeMaker.getRecipe("dark");
		assertEquals("dark", getRecipe.getRecipeName());
		
		//Add Recipe
		coffeeRecipe = new MyRecipe("double", 2, 2, 2, 0, 0);
		assertEquals(true, coffeeMaker.addRecipe(coffeeRecipe));
		getRecipe = coffeeMaker.getRecipe("double");
		assertEquals("double", getRecipe.getRecipeName());
		
		coffeeMaker.deleteRecipe("dark");
		assertNull(coffeeMaker.getRecipe("dark"));
			
	}

	@Test
	public void MakeCoffee() {
		fail("Not yet implemented");
		
		MyCoffeeMaker coffeeMaker = new MyCoffeeMaker();
		MyRecipe coffeeRecipe;
		
		coffeeRecipe = new MyRecipe("dark",  2, 1, 1, 0, 0);
		MyInventory inv;
		
		assertEquals(true, coffeeMaker.addRecipe(coffeeRecipe));
		assertEquals(true, coffeeMaker.makeCoffee("dark"));
		
		inv = coffeeMaker.getInventory();
		assertEquals(10, inv.getCoffee());
		
		//Add a new recipe
		coffeeRecipe = new MyRecipe ("DarkSouls", 20, 0, 0, 0, 0);
		assertEquals(true, coffeeMaker.addRecipe(coffeeRecipe));
		
		assertEquals(true, coffeeMaker.makeCoffee("DarkSouls"));
			
	}

}
