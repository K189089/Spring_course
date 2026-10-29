class Telusko1
{
    private String name ="Telusko edu";
    void disp()
    {
        System.out.println(name);
    }
}
class Alien1 extends Telusko1
{
    void disp2()
    {
        //name="alien";   // encapsulation
    }
}
public class LaunchInheritance3
{
    public static void main(String[] args)
    {
        Alien1 a=new Alien1();
        a.disp();
    }
}
