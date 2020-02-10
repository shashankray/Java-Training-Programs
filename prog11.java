public class iIfElseIf {
    public static void main(String[] args)
    {
        int age=22;
        if(age>13)
        {
            System.out.println("Welcome to my website");
            if(age<=25 && age>=20)
            {
                System.out.println("You have won a discount");
            }
        }
        else if(age==13)
        {
            System.out.println("please provide your email id");
        }
        else
         {
             System.out.println("You must be above 13 years of age");
        }
        System.out.println("Please leave some feedback");
    }
}