import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number:");
        long enteredNumber = scanner.nextLong();
        System.out.println(FizzBuzz.getResult(enteredNumber));

    }
}