package edu.university.staff;

public class Dosen extends Pegawai {
    private int jumlahSKS;

    public Dosen(String nama, double gajiPokok, int jumlahSKS) {
        super(nama, gajiPokok);
        this.jumlahSKS = jumlahSKS;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (jumlahSKS * 150000);
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis Pegawai: Dosen");
        System.out.println("Jumlah SKS: " + jumlahSKS);
    }
}