public class Wrapper {
    public static void main(String[] args){
        int a=10;
        System.out.println(a);

        //Integer i=new Integer(10); //Deprecated
        Integer i=Integer.valueOf(10);
        System.out.println(i);

        //Boxing : Converting primitive data type into its corresponding wrapper class object
        //AutoBoxing : automatically Converting primitive data type into its corresponding wrapper class object by Java
        int n1=14;
        Integer n2=n1;//sutoBoxing
        Integer x=Integer.valueOf(n1);//boxing

        //Unboxing : Converting wrapper class object into its corresponding primitive data type
        //AutoUnboxing ; automatic conversion of wrapper class object into its corresponding primitive data type by Java
        Integer n3=Integer.valueOf(44);
        int n4=n3;// autoUnboxing

        int n5=n3.intValue();// Unboxing
    }
}
