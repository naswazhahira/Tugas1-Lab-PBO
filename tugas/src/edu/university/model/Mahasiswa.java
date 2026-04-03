package edu.university.model;

public class Mahasiswa {
    private int nim;
    private String nama;
    private float ipk;

    public Mahasiswa() {
    }

    public Mahasiswa(int nim, String nama, float ipk) {
        this.setNIM(nim);
        this.setNama(nama);
        this.setIPK(ipk);
    }

    public void setNIM(int nim) { this.nim = nim;}
    public void setNama(String nama) { this.nama = nama; }
    public void setIPK(float ipk) {this.ipk = ipk;}

    public int getNim() {return this.nim;}
    public String getNama() {return this.nama; }
    public float getIpk() {return this.ipk; }

    public String getKategoriIPK() {
        if(this.ipk >= 3.5){
            return "Cumlaude";
        }
        else if(this.ipk >= 3.0){
            return "Sangat Memuaskan";
        }
        else if(this.ipk >= 2.5){
            return "Memuaskan";
        }
        else{
            return "Perlu Perbaikan";
        }
    }
}