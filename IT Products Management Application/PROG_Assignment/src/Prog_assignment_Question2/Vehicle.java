package Prog_assignment_Question2;

public class Vehicle
{
    //This is a parent class for a Car class//
    //These are the private fields in vehicles//
    private String make;
    private String color;
    private String year;
    private String model;
    
    // Parameterized Constructor
    public Vehicle(String make, String color, String year, String model)
    {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    // This method to print the model,color,year and manufacturer//
    @Override
    public String toString()
    {
        String show = String.format("Manufacturer : %s\nModel : %s\nColor : %s\nYear %s", make,model,color,year);
        return show;
    }

   
}
