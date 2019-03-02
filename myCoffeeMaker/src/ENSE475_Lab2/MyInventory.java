/*
 * Name: Muhammad Ishraf Shafiq Zainuddin
 * ID  : 200342741
 * File: myInventory.java
 * 
 * Reference Author:
 * tdouglas
 */

package ENSE475_Lab2;

public class MyInventory {
	
	//Initialize data members
		private int coffee;
		private int milk;
		private int sugar;
		private int chocolate;
		private int marshmallow;
		
		//Constructor
		public MyInventory() {
			coffee = 0;
			milk = 0;
			sugar = 0;
			chocolate = 0;
			marshmallow = 0;
		}
		
		public int getMilk() {
			return milk;
		}
		
		public void setMilk(int milk) {
			this.milk = milk;
		}
		
		public int getCoffee() {
			return coffee;
		}
		
		public void setCoffee(int coffee) {
			this.coffee = coffee;
		}
		
		public int getSugar() {
			return sugar;
		}
		
		public void setSugar(int sugar) {
			this.sugar = sugar;
		}
		
		public int getChocolate() {
			return chocolate;
		}
		
		public void setChocolate(int chocolate) {
			this.chocolate = chocolate;
		}
		
		public int getMarshmallow() {
			return marshmallow;
		}
		
		public void setMarshmallow(int marshmallow) {
			this.marshmallow = marshmallow;
		}

}
