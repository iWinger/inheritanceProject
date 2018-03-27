package test;
import java.util.Scanner;

public class Pizza
{   //protected allows for subclasses to inherit variables 
    private final String[] toppingMenu = {"Pepperoni", "Sausage", "Meatball", "Bacon", "Ham", "Spinach", "Broccoli", "Onions", "Peppers", "Tomatoes", "Black Olives"};
    private int numToppings;
    private int size; // 1, 2, 3...S, M, L respectively 
    private String[] myToppings;
    
    
    public Pizza(int size, int numToppings)
    {
        this.numToppings = numToppings;
        this.size = size;
        myToppings = new String[numToppings]; 
        printToppingMenu();
        setMyToppings();
    }
        
    public Pizza(int size)
    {
        this.numToppings = 0; 
        this.size = size ;
        myToppings = new String[numToppings];
    }
    
    public void printToppingMenu()
    {
      System.out.println("Toppings\n");
      
      int i = 1; 
      for( String e : toppingMenu)
      {
          System.out.println("\t" + i + "-" + e);
          i++;
          
          
      }
        
        
    }
    
    public int getNumToppings()
    {
        return numToppings;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public String[] getMyToppings()
    {
        return myToppings;
    }
    
    public void setNumToppings(int numToppings)
    {
        this.numToppings = numToppings;
    }
    
    public void setSize(int size)
    {
        this.size = size;
    }
    
    //uses this to help you initialize the toppings array. 
    public void setMyToppings()
    {
        Scanner reader = new Scanner(System.in);
        
        for(int i = 0; i < numToppings; i++)
        {
            System.out.println("What topping would you like? ");
            myToppings[i] = toppingMenu[reader.nextInt()-1];
            
        }
    }
    
    public String toString()
    {
    	String ssize = null;
    	if(size == 1)
    		ssize = "Medium";
    	else if (size == 2)
    		ssize = "Large";
    	else 
    		ssize = "N/A";
    	
        String summary = " Size: "  + ssize + ", Number of Toppings: " + numToppings + ", Toppings: ";
       
       for(String e : myToppings)
       {
           summary += e + ",";

         
        }
        
       return summary; 
    
    }
}
