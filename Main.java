import java.util.Scanner;

public class Main {
    private static Scanner keyBoard = new Scanner(System.in);
    private static Car myCar = new Car();

    public static void main(String[] args) {
        System.out.println("=== Amazon Jr. Software Dev: Driving Simulation ===");
        
        while (true) {
            displayDashboard();
            int choice = getUserChoice();
            processChoice(choice);
        }
    }

    private static void displayDashboard() {
        System.out.println("\n------ Car Dashboard ------");
        System.out.println("Speed: " + myCar.getSpeed() + " | Gear: " + myCar.getGear() + 
                           " | Engine: " + (myCar.isEngineOn() ? "On" : "Off"));
        System.out.println("1. Engine On/Off | 2. Change Gear | 3. Accelerate | 4. Brake | 5. Exit");
    }

    private static int getUserChoice() {
        while (true) {
            System.out.print("Choice: ");
            try {
                return Integer.parseInt(keyBoard.next());
            } catch (NumberFormatException e) {
                System.out.println("Lütfen geçerli bir sayı girin!");
            }
        }
    }

    private static void processChoice(int choice) {
        switch (choice) {
            case 1 -> myCar.toggleEngine();
            case 2 -> {
                System.out.print("Gear (P, D, R): ");
                myCar.changeGear(keyBoard.next().toUpperCase());
            }
            case 3 -> myCar.accelerate();
            case 4 -> myCar.brake();
            case 5 -> {
                System.out.println("Simülasyon kapatılıyor...");
                System.exit(0);
            }
            default -> System.out.println("Geçersiz seçim!");
        }
    }
}
