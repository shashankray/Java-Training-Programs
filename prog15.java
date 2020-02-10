class A
{
    void display()
    {
        System.out.println("display of class A");
    }
}
class MethodOverriding extends A
{
    void display(){
        System.out.println("Display of overriding");
    }
    public static void main(String [] args)
    {
        /*
        class Dad
        {
           void drive()
           safe driving
        }
        class Keerthi extends Dad
        void drive()
        rash driving// this is overriding
         */
        MethodOverriding overriding = new MethodOverriding();
        overriding.display();
    }
}