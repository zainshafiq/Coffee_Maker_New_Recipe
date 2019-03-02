/* Name: Muhammad Ishraf Shafiq Zainuddin
 * ID  : 200342741
 */
package ENSE475_Lab2;

public class MyCoffeeMaker {
	
	//Initializing data members
		private int numRecipes;
		private MyInventory inv;
	  	private MyRecipe[] rList;
	  	public static final int maxNumRecipe = 4;
	  	public static final int maxInventory = 20;
	  
	  	//Constructor
	  	public MyCoffeeMaker() {
	  		inv = new MyInventory();
	  		inv.setMilk(maxInventory);
	  		inv.setCoffee(maxInventory);
	  		inv.setSugar(maxInventory);
	  		inv.setChocolate(maxInventory);
	  		inv.setMarshmallow(maxInventory);
		
	  		rList = new MyRecipe[maxNumRecipe];
	  	}
	  	
	  	public boolean editRecipe(MyRecipe Recipe) {
	  		for (int i = 0; i < maxNumRecipe; i++ )
	  		{
	  			if (this.rList[i] == null) 
	  			{
	  				this.rList[i] = Recipe;
					this.numRecipes++;
					return true;
				}
			}
	  		
	  		return false; 	
	  	}
	  	
	  	public boolean addInventory(MyRecipe Inventory) {
	  		for (int i = 0; i < maxNumRecipe; i++ )
	  		{
	  			if (this.rList[i] == null) 
	  			{
	  				this.rList[i] = Inventory;
					this.numRecipes++;
					return true;
				}
			}
	  		
	  		return false; 
	  	}
	  	
	  	public MyInventory getInventory() {
	  		return this.inv;  		
	  	}
	  	  	
	  	public boolean addRecipe(MyRecipe rAdd)  {
	  		for (int i = 0; i < maxNumRecipe; i++ )
	  		{
	  			if (this.rList[i] == null) 
	  			{
	  				this.rList[i] = rAdd;
					this.numRecipes++;
					return true;
				}
			}
	  		
	  		return false;
	  	}
	  	
	  	public MyRecipe getRecipe(String recipeName) {
	  		for (int i = 0; i < maxNumRecipe; i++ )
	  		{
				if (this.rList[i].getRecipeName() == recipeName)
				{
					return this.rList[i];
				}
			}
	  		return null;
	  	}
	  	
	  	public boolean deleteRecipe(String recipeName) {
	  		for (int i = 0; i < maxNumRecipe; i++ ){
				if (this.rList[i].getRecipeName() == recipeName) {
					this.rList[i] = null;
					this.numRecipes--;
					return true;
				}				
			}
	  		
	  		return false;  		
	  	}
	  	
	  	public boolean makeCoffee(String recipeName) {
	  		MyRecipe currentRecipe = this.getRecipe(recipeName);
			if (currentRecipe != null) 
			{
				this.inv.setCoffee(this.inv.getCoffee() - currentRecipe.getCoffeeLevel());
				this.inv.setMilk(this.inv.getMilk() - currentRecipe.getMilkLevel());
				this.inv.setSugar(this.inv.getSugar() - currentRecipe.getSugarLevel());
				this.inv.setChocolate(this.inv.getChocolate() - currentRecipe.getChocolateLevel());
				this.inv.setMarshmallow(this.inv.getMarshmallow() - currentRecipe.getMarshmallowLevel());
				return true;
			}
			
			return false;
	  	}

}
