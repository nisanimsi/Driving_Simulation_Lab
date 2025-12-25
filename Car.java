public class Car {
    private String gear;
    private int speed;
    private boolean isEngineOn;

    public Car() {
        this.gear = "P";
        this.speed = 0;
        this.isEngineOn = false;
    }

    public void toggleEngine() {
        if (isEngineOn) {
            isEngineOn = false;
            speed = 0;
            gear = "P";
        } else {
            isEngineOn = true;
        }
    }

    public void changeGear(String newGear) {
        if (!isEngineOn) return;
        
        if (newGear.equals("P") || newGear.equals("D") || newGear.equals("R")) {
            this.gear = newGear;
            if (gear.equals("P")) this.speed = 0;
        }
    }

    public void accelerate() {
        if (isEngineOn && !gear.equals("P")) {
            speed += 10;
        }
    }

    public void brake() {
        if (isEngineOn && speed > 5) {
            speed -= 5;
        }
    }

    // Getter Metodları (Dashboard için)
    public int getSpeed() { return speed; }
    public String getGear() { return gear; }
    public boolean isEngineOn() { return isEngineOn; }
}
