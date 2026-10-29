import java.util.logging.FileHandler;

class Plane
{

}
class FighterPlane extends Plane
{

}

class Animal
{
    public void eat(String FoodType)
    {
        System.out.println("Animal eat");
    }
    void sleep()
    {
        System.out.println("Animal is sleeping");
    }
//    public void running()
//    {
//        System.out.println("animal is running");
//    }
    public Plane running()
    {
        System.out.println("Animal is running");
        Plane p=new Plane();
        return p;
    }
}
class Tiger extends Animal {

    //    void eat() // cannot reduce the visibility while overriding inherited methods
//    {
//        System.out.println("Tiger hunts and eat");
//    }
    public void eat(String FoodType)
    {
        System.out.println("Animal eat");
    }
    public void eat()// its overloaded method of child class and hence its specialized method of child class
    {
        System.out.println("tiger hunts and eat");
    }
    protected void sleep() // we can increase the visibility while overriding inherited methods
    {
        System.out.println("Tiger is sleeping");
    }

//    public int running() { // primetive return types can't be changed
//        System.out.println("tiger is running to hunt");
//
//    }

    public FighterPlane running() //Co-veriant return types are such return where there is a relationship
    {
        System.out.println("Tiger is running to hunt");
        FighterPlane fp=new FighterPlane();
        return fp;
    }
}

public class LaunchInheritance10
{
    public static void main(String[] args)
    {

    }
}
