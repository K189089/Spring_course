//final class Plane1 // cannot be inherited
//{
//    public void fly()
//    {
//        System.out.println("plane is flying");
//    }
//}
class Plane1
{
//    public final Plane1() //illegal
//    {
//
//    }
    final int age=10;

    final public void fly()
    {
        //a=20; //can't final
        System.out.println("plane is flying");
    }
//    final public static void fly()
//    {
//        //a=20; //can't final
//        System.out.println("plane is flying");
//    }
}
class FighterPlane1 extends Plane1
{
//    public void fly() //cannot override
//    {
//        System.out.println("plane is flying");
//    }

}

public class LaunchInheritanceFinal
{
    public static void main(String[] args)
    {
        FighterPlane1 f1=new FighterPlane1();
        f1.fly();
    }
}
