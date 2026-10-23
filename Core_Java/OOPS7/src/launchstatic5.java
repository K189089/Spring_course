class demo3 {
//    static int a;
//    static
//    {
//        a=10;
//    }

    static
    {
        disp();
    }
    static int a;

    public static void disp(){
        System.out.println(a);
    }
}

public class launchstatic5 {
    public static void main(String[] args){
        demo3 d=new demo3();
    }
}
