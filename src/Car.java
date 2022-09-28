public class Car {
    //Three properties
    private String make;
    private String model;
    private double price;
    private double retailPrice;

    //DEFAULT CONSTRUCTOR
    public Car(){
        this.make = "N/A";
        this.model = "N/A";
        this.price = 0;
    
    }
    //OVERLOADED CONSTRUCTOR THAT DEFINES PARAMETERS
    public Car(String make, String model, double price){
        this.make = make;
        this.model = model;
        this.price = price;
        calculateRetailCost();

    }

    //SETTERS METHODS
    public void setMake(String make){
        //Set the value to object instance property
        this.make = make;
    }
    public void setModel(String aModel){
        //Set the value to object instance property
        model = aModel;
    }

    public void setPrice(double aPrice){
        //Set the value to object instance property
        price = aPrice;
        
    }

    //GETTER METHOD
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public double getPrice(){
        return price;
    }
    public double getRetailPrice(){
        return retailPrice;
    }

    //Working Method
    private void calculateRetailCost(){
        retailPrice = price * 2;
    }

}
