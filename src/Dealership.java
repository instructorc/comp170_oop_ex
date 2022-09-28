public class Dealership {
    public static void main(String[] args) throws Exception {
        Car [] cars = new Car[2]; //Array of Car Objects

        for(var i = 0; i < cars.length; i++){
            cars[i] = new Car();
            if(i == 1){
                cars[i] = new Car("Toyota", "Sienna", 33000.12);

            }else{
                cars[i] = new Car("Nissan", "Murano", 45000.12);             
            }
        }

        for(var x = 0; x < cars.length; x++){
            System.out.println(x + ") Make: " + cars[x].getMake() + " Model: " + cars[x].getModel() + " Manufactors Price: " + cars[x].getPrice() + " Retail Price: " + cars[x].getRetailPrice());
        }
        

    }
}
