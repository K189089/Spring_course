class alien{
    static
    {
        System.out.println("sb1");
    }
    static
    {
        System.out.println("sb2");
    }
    {
        System.out.println("snb1");
    }
    {
        System.out.println("snb2");
    }
}
public class launchstatic4 {
    public static void main(String[] args){
        alien a1= new alien();

        alien a2 = new alien();

    }
}
