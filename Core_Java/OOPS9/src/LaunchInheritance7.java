class Alpha1
{
    int a,b;
    public Alpha1()
    {
        a=10;
        b=20;
        System.out.println("Alpha zero param constructor");
    }
    public Alpha1(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("param constructor of alpha");
    }

}
class Beta1 extends Alpha2
{
    int x,y;
    public Beta1()
    {
        x=1;
        y=2;
        System.out.println("Beta Zero param const");
    }
    public Beta1(int x,int y)
    {
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

public class LaunchInheritance7
{
    public static void main(String[] args)
    {
        Beta1 b=new Beta1(10,20);

    }
}
