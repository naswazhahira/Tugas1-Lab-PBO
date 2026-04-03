package edu.transport;

abstract class Kendaraan {
    protected String nama;
    protected int kecepatanMaks;

    public Kendaraan(String nama, int kecepatanMaks) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
    }

    public int getKecepatanMaks() {
        return kecepatanMaks;
    }

    abstract double hitungWaktuTempuh(double jarak);

    public void tampilkanInformasi() {
        System.out.println("Nama Kendaraan: " + this.nama);
        System.out.println("Kecepatan Maksimal: " + this.kecepatanMaks + " km/jam");

        double jarak = 120;
        double hasilWaktu = hitungWaktuTempuh(jarak);

        System.out.println("Waktu Tempuh untuk " + jarak + " km: " +
                            String.format("%.2f", hasilWaktu) + " jam");
    }
}