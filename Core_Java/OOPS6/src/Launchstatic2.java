class Demo2
{
    static int a,b,c;
    int x,y,z;

    static
    {
        System.out.println("static Intit block");
        a=10;
        b=20;
        c=30;
    }
    static void disp()
    {
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);

    }
    // Java Initialization
    {
        x=44;
        y=43;
        z=42;
        System.out.println("Java init block");
    }
    Demo2()
    {
        // first java init block
        System.out.println("Constructor");
    }
    void disp2()
    {
        System.out.println("Non static method");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println("z:"+z);
    }
}

public class Launchstatic2
{
    // static block is executed before main method block
    public static void main(String[] args)
    {
        Demo2.disp();

        Demo2 d2=new Demo2();
        d2.disp2();
        // second time static block is not executed
        Demo2 d3=new Demo2();
        d3.disp2();
    }
}
