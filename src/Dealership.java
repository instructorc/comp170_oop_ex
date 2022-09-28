
import java.util.Scanner;
public class Dealership {
    public static void main(String[] args) throws Exception {
        Car [] cars = new Car[2]; //Array of Car Objects
        Scanner input = new Scanner(System.in);
        String make, model;
        double price;

        for(var i = 0; i < cars.length; i++){
   
            System.out.println( "For car " + (i+1));
            System.out.print("Please enter the make: ");
            make = input.nextLine();

            System.out.print("Please enter the model: ");
            model = input.nextLine();

            System.out.print("Please enter the price: ");
            price = Double.parseDouble(input.nextLine());

            cars[i] = new Car(make, model, price);
        }

        for(var x = 0; x < cars.length; x++){
            //System.out.println(x + ") Make: " + cars[x].getMake() + " Model: " + cars[x].getModel() + " Manufactors Price: " + cars[x].getPrice() + " Retail Price: " + cars[x].getRetailPrice());
            System.out.println( cars[x]);
            
        }
        

    }
}
