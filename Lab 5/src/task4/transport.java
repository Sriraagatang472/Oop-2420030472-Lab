package task4;
import java.util.Scanner;

class Transport {
    void ticketPrice() {
        System.out.println("Generic transport ticket price.");
    }
}

class Bus extends Transport {

    void ticketPrice() {
        System.out.println("Bus ticket price: ₹50");
    }
}

class Train extends Transport {
    @Override
    void ticketPrice() {
        System.out.println("Train ticket price: ₹120");
    }
}

public class transport{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter transport type (Bus / Train):");
        String input = sc.next();

        try {
            Class<?> cls = Class.forName("Lab6." + input);
            Transport t = (Transport) cls.getDeclaredConstructor().newInstance();
            t.ticketPrice();
        } catch (Exception e) {
            System.out.println("Invalid transport type.");
        }
        sc.close();
    }
}