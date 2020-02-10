public class Operators {
    public static void main(String[] args)
    {
        //Arithematic operators
        int a=10, b=20, c=15, d=40;
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("b/a="+(b/a));
        System.out.println("c%a="+(c%a));
        a++;
        System.out.println("a++="+a);
        a--;
        System.out.println("a--="+a);
      //Relational operators
         System.out.println("a==b is "+(a==b));
         System.out.println("a!=b is "+(a!=b));
        System.out.println("a>b is "+(a>b));
        System.out.println("a<b is "+(a<b));
        System.out.println("a>=b is "+(a>=b));
        System.out.println("a<=b is "+(a<=b));
        //Logical operators
        System.out.println("&&: "+((a==b)&&(a!=b)));
        System.out.println("||: "+((a!=b)||(a<b)));
        System.out.println("!: "+(a!=b));
        //Conditional operator
        int result=(a>b)?0:1;
        System.out.println("Result:"+result);
    }
}