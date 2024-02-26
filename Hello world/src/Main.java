import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;
        int age;

        Scanner in = new Scanner(System.in);

        System.out.print("Hello!\nEnter your name: ");
        name = in.next();
        System.out.print("Enter your age: ");
        age = in.nextInt();
        in.close();

        if (age < 1 || age > 101){
            System.out.println("You entered invalid age!");
            age = 10;
        }

        System.out.printf("Hello %s!\nYou are %d y.o.", name, age);
    }
}
