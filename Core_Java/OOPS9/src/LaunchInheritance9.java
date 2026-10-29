class parent
{
    int i=10;
    void disp(){
        System.out.println("disp of parent");
    }
}
class child extends parent
{
    int i =100;

    void aplha()
    {
        System.out.println("alpha");
        System.out.println(i);
        System.out.println(super.i);
        //disp();
        super.disp();
    }
    void disp()
    {
        System.out.println("child");
    }
}

public class LaunchInheritance9
{
    public static void main(String[] args)
    {
        new child().aplha();
    }
}
