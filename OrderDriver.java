package test;
import java.util.*;

public class OrderDriver {
public static void main(String[] args) {
	// Creation of pizzas
	final ArrayList<Pizza> pizzaOrder = new ArrayList<>();
	
	int i = 0;
	while(i != -1){
		int size = 0;
		int numTops = 0;
		boolean checkPizza = false;
		boolean checkSpecialty = false;
		String specialty = null;
		String[] toppings = null;
		
		Order newOrder = new Order();
		checkPizza = newOrder.orderPizzas();
		if(checkPizza == false)
			break;
		checkSpecialty = newOrder.ifSpecialty();
		
		if ( checkPizza == true && checkSpecialty == true) {
			// create a special pizza;
			SpecialtyPizza.printSpecialties();
			specialty = newOrder.getSpecialty();
			size = newOrder.getSize();
			numTops = newOrder.getNumToppings();
			
		
			SpecialtyPizza specPizza = new SpecialtyPizza(size,numTops,specialty);
			/*System.out.println(specPizza.toString());*/
			/*for( int n = 0; n < numTops; n++) {
				toppings[n] = newOrder.getToppings();
			}*/
			/*specPizza.printSpecialties();
			specPizza.setSpecialName();*/
			
			 pizzaOrder.add(i, specPizza);
		}
		else if( checkPizza == true && checkSpecialty == false) {
			// create a normal pizza;
			size = newOrder.getSize();
			numTops = newOrder.getNumToppings();
			Pizza regPizza = new Pizza(size, numTops);
			/*System.out.println(regPizza.toString());*/
			pizzaOrder.add(i, regPizza);
		}
			
		
		i++;
		
	}
	
	for(int x = 0; x < i; x++) {
		System.out.println("Pizza #" + (x+1) + ": " + (pizzaOrder.get(x)).toString());
	}
}

}
