public class OverloadingMain
{
    public void add()
    {
        System.out.println("Output:"+2);
    }
    public void add(int a)
    {
        System.out.println("Output:"+(a+a));
    }
    public void add(int a ,int b)
    {
        System.out.println("Output:"+(a+b));
    }
    public void add(int a, int b, int c)
    {
        System.out.println("Output:"+(a+b+c));
    }
    public void add(int a, String b)
{
    System.out.println("Output:"+(a+b));
}

    public static void main(String [] args)
    {
        /*Method overloading:Same name with different set of arguments
        public void m1()
        {}
        public void m1(int a)
        {}
        public void(String a1, String a2)
        {}
        public void(String a1, int a2)
        {}
         */
        OverloadingMain overloadingMain= new OverloadingMain();
        overloadingMain.add();
        overloadingMain.add(2);
        overloadingMain.add(2,3);
        overloadingMain.add(2,3,5);
        overloadingMain.add(2,"Test");
    }
}