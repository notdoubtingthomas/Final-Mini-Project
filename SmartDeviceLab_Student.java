public class SmartDeviceLab_Student {

    // TODO (Advanced): Create a static counter to track number of devices created
    // private static int deviceCount = 0;

    private static int deviceCount = 0;

    static class SmartDevice {
        // TODO 1: Make all fields private
        // private String deviceName;
        // private int batteryLevel;     // 0–100
        // private boolean isOnline;

        private String deviceName;
        private int batteryLevel;
        private boolean isOnline;

        // TODO 2: Implement a constructor that sets deviceName and batteryLevel
        // Rules:
        // - batteryLevel must be clamped to 0–100
        // - isOnline should start as false
        // - increment deviceCount (advanced)
        public SmartDevice(String deviceName, int batteryLevel) {
            // TODO: initialize fields using this.keyword
            this.deviceName = deviceName;
            this.batteryLevel = clampBattery(batteryLevel);
            deviceCount++;
        }

        // TODO 3: Add getters
        // public String getDeviceName() { }
        // public int getBatteryLevel() { }
        // public boolean isOnline() { }

        public String getDeviceName() {
            return deviceName;
        }

        public int getBatteryLevel() {
            return batteryLevel;
        }

        public boolean isOnline() {
            return isOnline;
        }

        // TODO 4: Add setters with validation
        // public void setDeviceName(String deviceName) { }
        // public void setBatteryLevel(int batteryLevel) { }  // clamp to 0–100

        public void setDeviceName(String deviceName) {
            if (deviceName.isEmpty()) {
                System.out.println("Error: Name is Empty. Please try again.");
            } else {
                this.deviceName = deviceName;
            }
        }

        public void setBatteryLevel(int batteryLevel) {
            clampBattery(batteryLevel);
        }

        // TODO 5: Add chargeBattery(int amount)
        // Rules:
        // - if amount <= 0, do nothing
        // - batteryLevel increases by amount, but max is 100
        public void chargeBattery(int amount) {
            // TODO
            if (amount <= 0) {
            }

            if (batteryLevel + amount <= 100) {
                batteryLevel = batteryLevel + amount;
            } else {
                System.out.println("Error: Total Battery must be less than or equal to 100.");
            }

        }

        // TODO 6: Add togglePower()
        // Rule:
        // - if batteryLevel == 0, device cannot be turned on
        public void togglePower() {
            // TODO
            if (batteryLevel == 0) {
                System.out.println("Device cannot be turned on.");
            } else {
                this.isOnline = true;
            }
        }

        // TODO 7: Add displayStatus() that prints:
        // Device: <name> | Battery: <battery>% | Online: <true/false>
        public void displayStatus() {
            // TODO
            System.out.println("Device: " + deviceName + " | Battery: " + batteryLevel + " | Online: " + isOnline);
        }

        // TODO (Advanced): Add a static getter for deviceCount
        // public static int getDeviceCount() { return deviceCount; }

        public static int getDeviceCount() {
            return deviceCount;
        }

        // Helper: clamp battery 0..100
        private int clampBattery(int value) {
            if (value < 0) return 0;
            if (value > 100) return 100;
            return value;
        }
    }

    public static void main(String[] args) {
        // TODO 8: Instantiate two devices with different starting battery levels
        // SmartDevice d1 = new SmartDevice("Thermostat", 65);
        // SmartDevice d2 = new SmartDevice("DoorSensor", 10);

        SmartDevice d1 = new SmartDevice("Car Keys", 99);
        SmartDevice d2 = new SmartDevice("Microphone", 5);

        // TODO 9: Demonstrate independent states:
        // - turn one on
        // - charge one
        // - show that the other device state is unchanged
        // d1.togglePower();
        // d2.chargeBattery(50);

        d1.togglePower();
        d1.chargeBattery(1);


        // TODO: Display statuses
        // d1.displayStatus();
        // d2.displayStatus();

        d1.displayStatus();
        d2.displayStatus();

        // TODO (Advanced): Print deviceCount
        // System.out.println("Devices created: " + SmartDevice.getDeviceCount());

        System.out.println("Devices created: " + SmartDevice.getDeviceCount());
    }
}
