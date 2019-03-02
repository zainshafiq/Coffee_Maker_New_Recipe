/*
 * Name: Muhammad Ishraf Shafiq Zainuddin
 * ID  : 200342741
 * File: myRecipe.java
 * 
 * Reference Author:
 * tdouglas
 */

package ENSE475_Lab2;

public class MyRecipe {
	
	//Declaring data members
		private String recipeName;
		private int coffeeLevel;
		private int milkLevel;
		private int sugarLevel;
		private int chocolateLevel;
		private int marshmallowLevel;
		
		
		public MyRecipe(String recipeName, int milkLevel, int sugarLevel, int coffeeLevel, int chocolateLevel, int marshmallowLevel) {
			this.recipeName = recipeName;
			this.coffeeLevel = coffeeLevel;
			this.milkLevel = milkLevel;
			this.sugarLevel = sugarLevel;
			this.chocolateLevel = chocolateLevel;
			this.marshmallowLevel = marshmallowLevel;
		}
		
		public String getRecipeName() {
			return recipeName;
		}
		
		public int getCoffeeLevel() {
			return coffeeLevel;
		}
		
		public int getMilkLevel() {
			return milkLevel;
		}
		
		public int getSugarLevel() {
			return sugarLevel;
		}
		
		public int getChocolateLevel() {
			return chocolateLevel;
		}
		
		public int getMarshmallowLevel() {
			return marshmallowLevel;
		}

}
