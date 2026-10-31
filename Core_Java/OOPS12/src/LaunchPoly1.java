class AeroPlane
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
class CargoPlane extends AeroPlane
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
class FighterPlane extends AeroPlane
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
public class LaunchPoly1
{
    public static void main(String[] args)
    {
        AeroPlane cp=new CargoPlane();
        cp.takingOff();
        cp.landing();
        //((CargoPlane) cp).fly();

        AeroPlane fp=new FighterPlane();
        fp.takingOff();
        fp.landing();
        //((FighterPlane) fp).fly();
    }
}
