package edu.transport;

public class Mobil extends Kendaraan {

    public Mobil(String nama, int kecepatanMaks){
        super (nama, kecepatanMaks);
    }

    @Override
    public double hitungWaktuTempuh(double jarak){
        double kecepatanEfektif = this.getKecepatanMaks() * 0.80;
        return jarak/kecepatanEfektif;
    }
}
