import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant resto = new Restaurant();
        int customerID, orderQty;
        try {

            System.out.println("Enter Customer ID: ");
            customerID = input.nextInt();

            System.out.println("Enter how much Food to made: ");
            orderQty = input.nextInt();

            Thread first = new Thread(resto);
            Waiters waiter = new Waiters(customerID, orderQty);
            Thread second = new Thread(waiter);

            first.start();
            second.start();
            first.join();
            second.join();

        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }

    }

}