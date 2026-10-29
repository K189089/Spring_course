class AeroPlane //extends object class
{
    void fly()
    {
        System.out.println("a f");
    }
    void land()
    {
        System.out.println("a l");
    }
}
class CargoPlane
{

}

//class CommercialPlane extends CargoPlane , AeroPlane //cannot inherite multiple class
//{
//
//}

class PassengerPlane extends AeroPlane
{
    void fly() //override method
    {
        System.out.println("plane medium height");
    }
    void takeoff() //spesilized method
    {
        System.out.println("Taking off");
    }
}

public class launchInheritance2 {
    public static void main(String[] args){
        CargoPlane cp=new CargoPlane();
        //cp.fly();
        //cp.land();

//        PassengerPlane p=new PassengerPlane();
//        p.fly();
//        p.land();

        AeroPlane plane=new PassengerPlane();//parent type ,upcasting
        plane.fly();
        plane.land();
        ((PassengerPlane) plane).takeoff(); //downcasting

    }
}
