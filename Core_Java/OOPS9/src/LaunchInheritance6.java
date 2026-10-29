class Alpha
{
    int a,b;
    public Alpha()
    {
        a=10;
        b=20;
        System.out.println("Alpha zero param constructor");
    }
    public Alpha(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("param constructor of alpha");
    }

}
class Beta extends Alpha
{
    int x,y;
    public Beta()
    {
        x=1;
        y=2;
        System.out.println("Beta Zero param const");
    }
    public Beta(int x,int y)
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
public class LaunchInheritance6
{
    public static void main(String[] args)
    {
        Beta b=new Beta();
        b.disp();
    }
}
