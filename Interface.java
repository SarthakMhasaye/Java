
interface ControllableDevice {
    void powerOn();
    void powerOff();
    void statusReport();
}

interface InternetEnabled {
    void connectWifi();
}

class SmartTV implements ControllableDevice, InternetEnabled {

    public void powerOn() {
        System.out.println("SmartTV is powered ON.");
    }

    public void powerOff() {
        System.out.println("SmartTV is powered OFF.");
    }

    public void statusReport() {
        System.out.println("SmartTV Status: Ready");
    }

    public void connectWifi() {
        System.out.println("SmartTV connected to WiFi.");
    }
}

class SmartFridge implements ControllableDevice, InternetEnabled {

    public void powerOn() {
        System.out.println("SmartFridge is powered ON.");
    }

    public void powerOff() {
        System.out.println("SmartFridge is powered OFF.");
    }

    public void statusReport() {
        System.out.println("SmartFridge Status: Cooling");
    }

    public void connectWifi() {
        System.out.println("SmartFridge connected to WiFi.");
    }
}

class SmartAC implements ControllableDevice {

    public void powerOn() {
        System.out.println("SmartAC is powered ON.");
    }

    public void powerOff() {
        System.out.println("SmartAC is powered OFF.");
    }

    public void statusReport() {
        System.out.println("SmartAC Status: Cooling Mode");
    }
}

public class Interface {
    public static void main(String[] args) {

        ControllableDevice tv = new SmartTV();
        ControllableDevice fridge = new SmartFridge();
        ControllableDevice ac = new SmartAC();

        tv.powerOn();
        tv.statusReport();
        tv.powerOff();

        System.out.println();

        fridge.powerOn();
        fridge.statusReport();
        fridge.powerOff();

        System.out.println();

        ac.powerOn();
        ac.statusReport();
        ac.powerOff();

        InternetEnabled tvWifi = new SmartTV();
        InternetEnabled fridgeWifi = new SmartFridge();

        tvWifi.connectWifi();
        fridgeWifi.connectWifi();
    }
}
