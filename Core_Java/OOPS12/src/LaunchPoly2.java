class AeroPlane1
{
    public void takingOff()
    {
        System.out.println("takeoff");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
    public void landing()
    {
        System.out.println("landing");
    }
}
class CargoPlane1 extends AeroPlane1
{
    public void takingOff()
    {
        System.out.println("longer runway to takeoff");
    }
    public void fly()
    {
        System.out.println("cargoplane is flying");
    }
    public void landing()
    {
        System.out.println("cargoplane landing");
    }
}
class FighterPlane1 extends AeroPlane1
{
    public void takingOff()
    {
        System.out.println("shorter runway to takeoff");
    }
    public void fly()
    {
        System.out.println("fighterplane is flying");
    }
    public void landing()
    {
        System.out.println("fighterplane landing");
    }
}
class PassengerPlane1 extends AeroPlane1
{
    public void takingOff()
    {
        System.out.println("longer runway to takeoff");
    }
    public void fly()
    {
        System.out.println("Passengerplane is flying");
    }
    public void landing()
    {
        System.out.println("Passengerplane landing");
    }
}
public class LaunchPoly2
{
    public static void main(String[] args)
    {
        CargoPlane1 cp=new CargoPlane1();

        FighterPlane1 fp=new FighterPlane1();

        PassengerPlane1 pp=new PassengerPlane1();

        AeroPlane1 ref;

        ref=cp;

        ref.takingOff();
        ref.fly();
        ref.landing();

        System.out.println("**********");

        ref=fp;

        ref.takingOff();
        ref.fly();
        ref.landing();

        System.out.println("**************");

        ref=pp;

        ref.takingOff();
        ref.fly();
        ref.landing();

    }
}
