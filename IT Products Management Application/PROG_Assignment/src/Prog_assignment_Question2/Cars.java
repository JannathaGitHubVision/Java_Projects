package Prog_assignment_Question2;

public class Cars extends Vehicle
{//------------------------------------------------------------------Cars that Extends Vehicle-------------------------------------------------------//

    //I inhert the vehicle class which mean this class is a child's class//
    //Private String variables of this class
    private final String bodyStyle;
    private final String price;

    //this is a construction//
    public Cars(String make, String color, String year, String model, String bodyStyle, String price)
    {
        
        super(make, color, year, model);  //iam calling parent class constructor
        this.bodyStyle = bodyStyle;
        this.price = price;
    }

    @Override
    public String toString()
    {
        //displaying the detials  of cars
        //iam calling method from parent class
        String show = String.format("%s\nBody Style : %s\nPrice : %s", super.toString(), bodyStyle, price);
        return show;
    }

}//------------------------------------------------------------------End of Cars that Extends Vehicle-------------------------------------------------------//

