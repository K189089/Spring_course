class calc
{
    int num1; //instance variable(heap mem)
    int num2; //instance variable(heap mem)

    int add(){ //stack mem
        num1=20;
        num2=10;
        int res=num1+num2;// local variable(stack mem)
        return res;
    }

}


public class launch1
{
    public static void main(String[] args)// stack mem
    {
        calc c = new calc();
        int x=c.add();
    }
}
