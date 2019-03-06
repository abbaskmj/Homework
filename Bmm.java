package tamrinha;

public class Bmm {
    public static void main(String[] args) {

        int num1=25;
        int num2=5;

        while (num2 > 0 && num1>num2) {

                num1=num1-num2;

            if(num1<num2){
                int temp;
                int temp2;
                temp = num1;
                temp2=num2;
                num1=temp2;
                num2=temp;

            }
       }
        System.out.println(num1);
    }
}
