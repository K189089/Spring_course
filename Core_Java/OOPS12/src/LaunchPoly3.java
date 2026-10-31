class AeroPlane2
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
class CargoPlane2 extends AeroPlane2
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
class FighterPlane2 extends AeroPlane2
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
class PassengerPlane2 extends AeroPlane2
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
class Airport
{
    public void permit(AeroPlane2 aeroPlane)
    {
        aeroPlane.takingOff();
        aeroPlane.fly();
        aeroPlane.landing();
    }
}
public class LaunchPoly3
{
    public static void main(String[] args)
    {
        CargoPlane2 cp=new CargoPlane2();

        FighterPlane2 fp=new FighterPlane2();

        PassengerPlane2 pp=new PassengerPlane2();

        Airport a=new Airport();
        a.permit(cp);
        a.permit(fp);
        a.permit(pp);

    }
}
