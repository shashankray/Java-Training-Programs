[Yesterday 10:02 PM] Keerthi D Rokhade
    

public class OperatorOverloading
{
    public static void main (String [] args)
{
 System.out.println(10+20);
 System.out.println("Hello "+ "Java" );// Concatination
System.out.println("Hello "+ "Java " + 10 );
    System.out.println("Hello "+ "Java " +10+30);// Here 10 and 30 are treated ar string
System.out.println("Hello "+ "Java " +(10+30));
 // no explicit overloading
    // only impplicit overloading using "+"
}
}


