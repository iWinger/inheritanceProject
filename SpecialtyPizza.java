package test;
import java.util.Scanner;
public class SpecialtyPizza extends Pizza
{
    // instance variables - replace the example below with your own
    private final String[] specialties = {"Buffalo Chicken", "Hawaiian", "Philly Cheese Steak", "Pacific Veggie", "Oreo"};
    private String specialName = null;
    private int numToppings = getNumToppings();
    private int size = getSize();
    private String[] myToppings = getMyToppings();
   
    /**
     * Constructor for objects of class SpecialtyPizza
     */
    public SpecialtyPizza(int size, int numToppings, String specialName){
        // initialize instance variables
        super(size, numToppings);
        this.specialName = specialName;
    }
    public SpecialtyPizza(int size){
        super(size);
        this.specialName = specialName;
    }
    //print method
    
   
    public static void printSpecialties()
    {
      System.out.println("1-Buffalo Chicken \nPremium Chicken, American Cheese, Cheddar Cheese, Shredded Provolone Cheese, Onions, Hot Sauce.\n\n2-Hawaiian\n Sliced ham, smoked bacon, pineapple, roasted red peppers, provolone and cheese made with 100% real mozzarella.\n\n3-Philly Cheese Steak\nTender slices of steak, fresh onions, fresh green peppers, fresh mushrooms, provolone and American cheese.\n\n4-Pacific Veggie\nRoasted red peppers, fresh baby spinach, fresh onions, fresh mushrooms, tomatoes, black olives, feta, provolone, cheese made with 100% real mozzarella and sprinkled with a garlic herb seasoning.\n\n5-Oreo\nA double fudge brownie crust with Oreo Cookies 'n Cream Ice Cream, Topped with crushed Oreo Cookies pieces and drizzled with Marshmallow and fudge topping.\n\n");
      
        
        
    }
    // get methods override
   
    
    public String getSpecialName(){
        return specialName;
    }
    
    // set methods override
    
    public void setSpecialName(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a special type number: ");
        this.specialName = specialties[reader.nextInt()-1];
    }
    @Override
    public String toString(){
    	
    	String ssize = null;
    	if(size == 1)
    		ssize = "Medium";
    	else if (size == 2)
    		ssize = "Large";
    	else
    		ssize = "N/A";
    	
       String summary = "Type: " + specialName + ", Size: "  + ssize + ", Number of Toppings: " + numToppings + ", Toppings: ";
       
       for(String e : myToppings)
       {
    	
    	   if(e+2 != null)
    		   System.out.println("ah");
    	   else
    		   summary += e;

         
        }
        
       return summary; 
    
    }
}