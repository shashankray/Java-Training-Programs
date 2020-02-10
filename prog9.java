import java.util.Scanner;
public class SwapTwoVariables {
    public static void main(String[] args)
    {
        // Swap two variables
        int a,b,temp;
        System.out.println("Enter two variables to be swapped");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("Value of 1st variable="+a);
        System.out.println("Value of 1st variable="+b);

    }
}