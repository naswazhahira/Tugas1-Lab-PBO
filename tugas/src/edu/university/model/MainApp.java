package edu.university.model;

public class MainApp {
    public static void main(String[] args) {
        Mahasiswa[] mhs = new Mahasiswa[5];

        mhs[0] = new Mahasiswa(241401001, "Ahmad", 4);
        mhs[1] = new Mahasiswa(241401002, "Budi", 3.5f);
        mhs[2] = new Mahasiswa(241401003, "Caca", 3.25f);
        mhs[3] = new Mahasiswa(241401004, "Doni", 2.37f);
        mhs[4] = new Mahasiswa(241401005, "Gibran", 2.3f);

        for (int i = 0; i < mhs.length; i++) {
            System.out.println("===== Data Mahasiswa " + (i + 1) + " =====");
            System.out.println("NIM: " + mhs[i].getNim());
            System.out.println("Nama: " + mhs[i].getNama());
            System.out.println("IPK: " + mhs[i].getIpk());
            System.out.println("Kategori: " + mhs[i].getKategoriIPK());
            System.out.println();
        }
    }
}