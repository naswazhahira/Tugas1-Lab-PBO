package edu.transport;

public class Main {
    public static void main(String[] args){
        Kendaraan[] daftarKendaraan = new Kendaraan[4];

        daftarKendaraan[0] = new Mobil ("Pajero", 100);
        daftarKendaraan[1] = new Mobil("Suzuki", 90);
        daftarKendaraan[2] = new Motor("Supra", 50);
        daftarKendaraan[3] = new Motor("Beat", 60);

        for (int i = 0; i < daftarKendaraan.length; i++) {
            System.out.println("===== Data Kendaraan " + (i + 1) + " =====");
            daftarKendaraan[i].tampilkanInformasi();
            System.out.println();
        }
    }

}
