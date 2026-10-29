class Alpha2
{
    int a,b;
    public Alpha2()
    {
        a=10;
        b=20;
        System.out.println("Alpha zero param constructor");
    }
    public Alpha2(int a, int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("param constructor of alpha");
    }

}
class Beta2 extends Alpha2
{
    int x,y;
    public Beta2()
    {
        this(2,2);
        x=1;
        y=2;
        System.out.println("Beta Zero param const");
    }
    public Beta2(int x,int y)
    {
        super(4,44);
        this.x=x;
        this.y=y;
        System.out.println("Beta param const");
    }
    public void disp()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}
public class LaunchInheritance8
{
    public static void main(String[] args)
    {
        Beta2 b=new Beta2(1,2);
        b.disp();

        Beta2 b2=new Beta2();
        b2.disp();
    }
}
