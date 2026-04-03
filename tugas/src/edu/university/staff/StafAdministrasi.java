package edu.university.staff;

public class StafAdministrasi extends Pegawai {
    private int jamLembur;

    public StafAdministrasi(String nama, double gajiPokok, int jamLembur) {
        super(nama, gajiPokok);
        this.jamLembur = jamLembur;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (jamLembur * 50000);
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis Pegawai: Staf Administrasi");
        System.out.println("Jam Lembur: " + jamLembur);
    }
}
