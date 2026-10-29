class Telusko2
{
    Telusko2() // constructor never gets inherited
    {
        System.out.println("T 2 Zero param");
    }
}

class Alien2 extends Telusko2
{
    Alien2()
    {
        //super()
    }
}

public class LaunchInheritance5
{
    public static void main(String[] args)
    {
        Alien2 a=new Alien2();

    }
}
