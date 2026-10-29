class Telusko
{
    int age;
    void disp()
    {
        age=10;
        System.out.println(age);
    }
}

class Alien extends Telusko
{

}
//class Demo1{
//
//}
//class Demo2 extends Demo1
//{
//
//}

public class Launchinheritance1 {
    public static void main(String[] args){
//        Telusko t=new Telusko();
//        t.disp();

        Alien a=new Alien();
        a.disp();
    }
}
