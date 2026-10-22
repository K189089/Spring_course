//class Demo
//{
//    static int a,b,c;
//    int x,y,z;
//
//    static
//    {
//        System.out.println("static Intit block");
//        a=10;
//        b=20;
//        c=30;
//    }
//    static void disp()
//    {
//        System.out.println("a:"+a);
//        System.out.println("b:"+b);
//        System.out.println("c:"+c);
//
//    }
//}
// static method is stored in heap mem
// static method in class does not need to called by obj


public class Launchstatic
{
    static int a;

    static
    {
        a=10;
        System.out.println("a:"+a);
        System.out.println("static block");
    }

    public static void main(String[] args)
    {
        System.out.println("main method");
        //Demo.disp();
    }
}
