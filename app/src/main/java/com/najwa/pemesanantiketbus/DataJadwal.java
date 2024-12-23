package com.najwa.pemesanantiketbus;

public class DataJadwal {
    public DataJadwal(String namaBus, String rute, String waktu, double harga) {
    }

    public class Jadwal {
        private String namaBus;
        private String rute;
        private String waktu;
        private double harga;

        // Constructor
        public Jadwal(String namaBus, String rute, String waktu, double harga) {
            this.namaBus = namaBus;
            this.rute = rute;
            this.waktu = waktu;
            this.harga = harga;
        }

        // Getter dan Setter
        public String getNamaBus() {
            return namaBus;
        }

        public void setNamaBus(String namaBus) {
            this.namaBus = namaBus;
        }

        public String getRute() {
            return rute;
        }

        public void setRute(String rute) {
            this.rute = rute;
        }

        public String getWaktu() {
            return waktu;
        }

        public void setWaktu(String waktu) {
            this.waktu = waktu;
        }

        public double getHarga() {
            return harga;
        }

        public void setHarga(double harga) {
            this.harga = harga;
        }

        // Metode untuk menampilkan informasi jadwal
        @Override
        public String toString() {
            return "Jadwal{" +
                    "Nama Bus='" + namaBus + '\'' +
                    ", Rute='" + rute + '\'' +
                    ", Waktu='" + waktu + '\'' +
                    ", Harga=" + harga +
                    '}';
        }
    }

}
