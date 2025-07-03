import java.util.Scanner;
public class DrivingSimulationLab {

    public static String gear = "P";
    public static int speed = 0;
    public static boolean isEngineOn = false;
    public static Scanner keyBoard = new Scanner(System.in);

    public static void startSimulation() {
        boolean displayMenu = true;
        while (displayMenu) {
            displayDashboard();
            int choice = getUserChoice();
            processChoice(choice);
            System.out.println();
        }
    }
    public static void displayDashboard() {
        System.out.println("------ Car Dashboard ------");
        System.out.println("Speed: " + speed);
        System.out.println("Engine: " + (isEngineOn ? "On" : "Off"));
        System.out.println("Gear: " + gear);
        System.out.println("Menu:");
        System.out.println("1. Turn on/off the engine");
        System.out.println("2. Change gear (P, D, R)");
        System.out.println("3. Accelerate");
        System.out.println("4. Brake");
        System.out.println("5. Exit");
    }

    public static int getUserChoice() {
    while (true) {
        System.out.print("Enter your choice: ");
        String input = keyBoard.next();
        try {
            int choice = Integer.parseInt(input);
            return choice;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a number.");
        }
    }
    }

    public static void processChoice(int choice) {
        switch (choice) {

            case 1:
                toggleEngine();
                break;

            case 2:
                changeGear();
                break;

            case 3:
                accelerate();
                break;
            case 4:
                brake();
                break;
            case 5:
                exitSimulation();
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }

    public static void toggleEngine() {
        if (isEngineOn) {
            isEngineOn = false;
            System.out.println("Engine turned off.");
            speed = 0;

            gear = "P";
        } else {
            isEngineOn = true;
            System.out.println("Engine turned on.");
        }
    }

    public static void changeGear() {

        if (!isEngineOn) {
            System.out.println("Cannot change gear. Engine is off.");
            return;
        }

        System.out.print("Enter gear (P for Park, D for Drive, R for Reverse): ");
        String newGear = keyBoard.next().toUpperCase();

        if (newGear.equals("P") || newGear.equals("D") || newGear.equals("R")) {
            gear = newGear;
            System.out.println("Gear changed to: " + gear);

            if (gear.equals("P")) {
                speed = 0;
                System.out.println("Speed reset to 0 (Park mode).");
            }
        } else {
            System.out.println("Invalid gear selection. Please choose P, D, or R.");
        }
    }

    public static void accelerate() {

        if (isEngineOn && !gear.equals("P")) {
            speed += 10;
            System.out.println("Accelerating... Speed increased to: " + speed);
        } else {
              if (!isEngineOn) {
                System.out.println("Cannot accelerate. Engine is off.");
            } else if (gear.equals("P")) {
                System.out.println("Cannot accelerate. Car is in Park mode.");
            }
        }
    }

    public static void brake() {
          if (isEngineOn && speed > 5) {
            speed -= 5;
            System.out.println("Braking... Speed decreased to: " + speed);
        } else {
            if (!isEngineOn) {
                System.out.println("Cannot brake. Engine is off.");
            } else if (speed <= 5) {
                System.out.println("Cannot brake. Speed is too low (5 or less).");
            }
        }
    }

    public static void exitSimulation() {
        System.out.println("Thank you for using the Driving Simulation!");
        System.out.println("Simulation terminated!");

        System.exit(0);
    }

    public static void main(String[] args) {
        startSimulation();
    }
}