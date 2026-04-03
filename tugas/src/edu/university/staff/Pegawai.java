package edu.university.staff;

public class Pegawai {
    protected String nama;
    protected double gajiPokok;

    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public double hitungGaji() {
        return this.gajiPokok;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
        System.out.println("Total Gaji: " + hitungGaji());
    }
}