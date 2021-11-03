import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the value");
        int value = input.nextInt();
        input.close();
        double result;

        double fee2;
        if (value >= 0 && value <= 1000) {

            result = value * 1.18;
            fee2 = result - value;
            System.out.println("The value without fee is: " + value);
            System.out.println("The value with fee : " + result);
            System.out.println("The fee is: " + fee2);
        } else if (value > 1000) {

            result = value * 1.08;
            fee2 = result-value;
            System.out.println("The value without fee is: " + value);
            System.out.println("The value with fee : " + result);
            System.out.println("The fee is: " + fee2);

        } else if(value<0) {
            System.out.println("Values ​​less than 0 are not acceptable.");
        }
    }

}
