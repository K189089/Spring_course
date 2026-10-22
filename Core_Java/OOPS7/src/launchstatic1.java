//class demo{
//    static int a,b,c;
//    //static int b;
//
//    static
//    {
//        System.out.println("Static intialization block");
//        a=10;
//        b=20;
//        c=30;
//    }
//    static void disp()
//    {
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//    }
//}


public class launchstatic1 {
    static int a;

    static
    {
        a=10;
        System.out.println(a);
        System.out.println("static block");
    }

    public static void main(String[] args){
        System.out.println("main method");
        //demo.disp();
    }
}
