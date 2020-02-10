public class ConstructorOverloading {
    public ConstructorOverloading()
    {
     System.out.println("Constructor with no  parametrs");
    }
    public ConstructorOverloading(int a)
    {
        System.out.println("Constructor with one  parametrs");
    }
    public ConstructorOverloading(int a, int b)
    {
        System.out.println("Constructor with two parametrs");
    }
    public ConstructorOverloading(int a, String b)
    {
        System.out.println("Constructor with 1 integer and 1 String");
    }
    public static void main(String[] args)
    {
        new ConstructorOverloading();
        new ConstructorOverloading(1);
        new ConstructorOverloading(1,3);
        new ConstructorOverloading(1,"Name");
    }
}