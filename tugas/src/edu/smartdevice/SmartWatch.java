package edu.smartdevice;

public class SmartWatch implements Rechargeable, Connectable {
    private int batteryLevel;
    private boolean connected;
    private String ssid;

    @Override
    public void chargeBattery(int menit) {
        this.batteryLevel += menit;
        if (this.batteryLevel > 100) {
            this.batteryLevel = 100;
        }
        System.out.println("Mengisi daya selama " + menit + " menit...");
    }

    @Override
    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    @Override
    public void connectWifi(String ssid) {
        if (ssid != null && !ssid.isEmpty()) {
            this.connected = true;
            this.ssid = ssid;
            System.out.println("Menghubungkan ke WiFi: " + ssid);
        } else {
            this.connected = false;
            System.out.println("Gagal konek: SSID kosong!");
        }
    }

    @Override
    public boolean isConnected() {
        return this.connected;
    }

    public void tampilkanStatus() {
        System.out.println("\n===== Status SmartWatch =====");
        System.out.println("Baterai  : " + batteryLevel + "%");
        System.out.println("Koneksi  : " + (connected ? "Terhubung ke " + ssid : "Terputus"));
        System.out.println();
    }
}
