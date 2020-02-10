public class Methods
{
    public static void main(String [] args)
    {
        displayName("John",5);
    }
    public static void displayName(String name, int counter) {
        
        for (int i=0;i<counter;i++)
            System.out.println(i+" : " + name);
    }
}