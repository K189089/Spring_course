public class TernaryOperator {
    public static void main(String[] args){
        int num1=44;
        int num2=43;
        int num3=45;

        int res=(num1>num2) ? num1 : num2;
        System.out.println(res);

        int res2=(num1>num2) ? (num1>num3) ? num1:num3 : (num2>num3)?num2:num3;
        System.out.println(res2);
    }
}
