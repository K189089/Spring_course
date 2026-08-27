class Demo{
    int num1,num2;

    Demo(){
        super(); //
        System.out.println("zero param constructor");
    }
    Demo(int num1,int num2){
        // super() is here behind the jvm compiler
        this(num1); // This goes to Demo(int num1)
        this.num1=num1;
        this.num2=num2;
        System.out.println("2 param constructor");
    }
    Demo(int num1){
        // this() and super() conflicts only one can be there here super() will not be called
        this(); // this goes to Demo()
        this.num1=num1;
        num2=44;
        System.out.println(" 1 param constructor");
    }
    void disp(){
        System.out.println("num1 :"+num1);
        System.out.println("num2 :"+num2);
    }
}

public class LaunchConstructor
{
    public static void main(String[] args){
        Demo d1=new Demo(4);
        d1.disp();
        System.out.println("**************");

        Demo d2 = new Demo(4,5);
        d2.disp();
    }
}
