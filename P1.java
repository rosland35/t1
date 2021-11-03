import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int math, physics, art, chemistry, turkish, history;

        System.out.println("Enter your Math grade:");
        math = input.nextInt();
        System.out.println("Enter your Physics grade:");
        physics = input.nextInt();
        System.out.println("Enter your Art grade:");
        art = input.nextInt();
        System.out.println("Enter your Chemistry grade:");
        chemistry = input.nextInt();
        System.out.println("Enter your Turkish grade:");
        turkish = input.nextInt();
        System.out.println("Enter your History grade:");
        history = input.nextInt();
        input.close();

        int total = math + physics + art + chemistry + turkish + history;
        double average = total / 6;
        System.out.println("Your average is: " + average);
        String a = "you succeeded";
        String b = "you failed";
        String pass=a;
        pass=(average<60)? b:a;
        
        System.out.println(pass);


    }

}
