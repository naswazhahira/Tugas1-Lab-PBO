package edu.university.staff;

public class MainApp {
    public static void main(String[] args){
        Pegawai[] daftarPegawai = new Pegawai[4];

        daftarPegawai[0] = new Dosen("Hanum", 7000000, 9);
        daftarPegawai[1] = new Dosen("Lusi", 8000000, 12);
        daftarPegawai[2] = new StafAdministrasi("Jeno", 4000000, 3);
        daftarPegawai[3] = new StafAdministrasi("Riki", 4000000, 5);

        for (int i = 0; i < daftarPegawai.length; i++){
            System.out.println("===== Data Pegawai " + (i + 1) + " =====");
            daftarPegawai[i].tampilkanData();
            System.out.println();
        }
    }
}
