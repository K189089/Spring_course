class demo4
{
    static int a;

    public static void disp()
    {
        a=10;
        System.out.println(a+"parent class");
    }
}
class demo5 extends demo4
{
    public static void disp() //method hiding (cannot override static method
    {
        a=10;
        System.out.println(a+"child class ");
    }
}

public class LaunchInheritance11
{
    public static void main()
    {
        demo4 d=new demo5();
        d.disp();

        //demo4.disp();

        demo5 d5=new demo5();
        d5.disp();
    }
}
