[Yesterday 10:06 PM] Keerthi D Rokhade
    

public class Constructors
{
    public String model;
    public String colour;
    public int seats;
    public  Constructors()
    {
        model="test model";
        colour="Black";
        seats=4;
        System.out.println("First Constructor");
    }
    public Constructors(String model, String colour, int seats)
    {
        this.model=model;
        this.colour=colour;
        this.seats=seats;
    }
        public void display()
        {
            System.out.println("Model is  "+ model);
            System.out.println("Colour is "+ colour);
            System.out.println("Seats is "+ seats);
       }
}


