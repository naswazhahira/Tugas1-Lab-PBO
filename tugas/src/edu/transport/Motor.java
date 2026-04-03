package edu.transport;

public class Motor extends Kendaraan {

    public Motor(String nama, int kecepatanMaks){
        super (nama, kecepatanMaks);
    }

    @Override
    public double hitungWaktuTempuh(double jarak){
        double kecepatanEfektif = this.getKecepatanMaks() * 0.90;
        return jarak/kecepatanEfektif;
    }
}