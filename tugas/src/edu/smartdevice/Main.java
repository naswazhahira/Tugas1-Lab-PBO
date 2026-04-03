package edu.smartdevice;

public class Main {

    public static void main(String[] args) {
        SmartWatch jamSaya = new SmartWatch();

        jamSaya.tampilkanStatus();

        jamSaya.chargeBattery(45);

        jamSaya.connectWifi("Eduroam");

        jamSaya.tampilkanStatus();

        jamSaya.chargeBattery(70);
        System.out.println("Status Baterai Akhir: " + jamSaya.getBatteryLevel() + "%");
    }
}
