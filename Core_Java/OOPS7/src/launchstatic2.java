class demo2{
    static int a,b,c;
    int x,y,z;

    static
    {
        System.out.println("Static intialization block");
        a=10;
        b=20;
        c=30;
    }
    static void disp()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    // java init block
    {
        x=44;
        y=45;
        z=46;
        System.out.println("java init block");
    }
    demo2()
    {
        System.out.println("constructor");
    }

    void disp2()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

}
public class launchstatic2 {
    public static void main(String[] arg){
        demo2.disp();

        demo2 d2=new demo2();
        d2.disp2();
    }
}
