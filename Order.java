package test;
import java.util.*;
import java.util.Scanner;

public class Order
{
	
    private ArrayList<Pizza>cRegOrder = new ArrayList<Pizza>();
  
    
    int numTops;
    int size;
    
    
    
    public ArrayList<Pizza> getOrder(){
    	return cRegOrder;
    }
    
   
    public boolean orderPizzas()
    {
    	boolean validity = true;
        int orderpiz = 0;
        	Scanner reader = new Scanner(System.in);
            System.out.println("Would you like to order a pizza? Type 1 for yes, and 2 for no");
            orderpiz = reader.nextInt();
            if(orderpiz == 2)
            {
                System.out.println("Thanks for coming!");
                validity = false;
                return validity;
                
                
            }
            else if (orderpiz == 1) 
            {
             // place an order for pizza
            validity = true;	
                
            }
            
          
             
        return validity;
     
    }
    public boolean ifSpecialty() {
    	boolean spec = false;
    	Scanner reader = new Scanner(System.in);
    	int specpizza = 0;
    	System.out.println("Would you like to order a regular pizza(1) or a specialty pizza(2)? ");
    	specpizza = reader.nextInt();
    	
    	if(specpizza == 1) {
    		spec = false;
    	}
    	else if (specpizza == 2) {
    		spec = true;
    	}
    	return spec;
    	}
    public String getSpecialty() {
    	String specialty;
    	Scanner reader = new Scanner(System.in);
    	System.out.println("What type of specialty pizza? ");
    	specialty = reader.nextLine();
    	return specialty;
    }
    
    public int getSize() {
    	// idea behind this is to check whether it's large or medium
    	Scanner reader = new Scanner(System.in);
    	int size = 0;
    	System.out.println("What size? Medium(1) or large(2) ");
    	size = reader.nextInt();
    
    	return size;
    }
    public int getNumToppings() {
    	Scanner reader = new Scanner(System.in);
    	System.out.println("How many toppings?");
    	numTops = reader.nextInt();
    	return numTops;
    }
    
    public String getToppings() {
    	String toppings = null;

    	Scanner reader = new Scanner(System.in);
    	System.out.println("What topping would you like?");
    	toppings= reader.nextLine();
    
    return toppings;
    }
    
    
    
}