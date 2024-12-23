package com.najwa.pemesanantiketbus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TambahJadwal {
    // List untuk menyimpan jadwal
    private List<DataJadwal> daftarJadwal;

    // Constructor
    public TambahJadwal() {
        this.daftarJadwal = new ArrayList<>();
    }

    // Metode untuk menambahkan jadwal baru
    public void tambahJadwalBaru(String namaBus, String rute, String waktu, double harga) {
        DataJadwal jadwalBaru = new DataJadwal(namaBus, rute, waktu, harga);
        daftarJadwal.add(jadwalBaru);
        System.out.println("Jadwal berhasil ditambahkan:");
        System.out.println(jadwalBaru);
    }

    // Metode untuk menampilkan semua jadwal
    public void tampilkanSemuaJadwal() {
        if (daftarJadwal.isEmpty()) {
            System.out.println("Belum ada jadwal yang ditambahkan.");
        } else {
            System.out.println("Daftar Jadwal:");
            for (int i = 0; i < daftarJadwal.size(); i++) {
                System.out.println((i + 1) + ". " + daftarJadwal.get(i));
            }
        }
    }

    // Metode untuk menambahkan jadwal menggunakan input dari pengguna
    public void inputJadwalDariPengguna() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Tambah Jadwal Baru ===");

        System.out.print("Nama Bus: ");
        String namaBus = scanner.nextLine();

        System.out.print("Rute (contoh: LMP - JMB): ");
        String rute = scanner.nextLine();

        System.out.print("Waktu (contoh: 08:00 AM): ");
        String waktu = scanner.nextLine();

        System.out.print("Harga: ");
        double harga = scanner.nextDouble();
        scanner.nextLine(); // Membersihkan newline

        tambahJadwalBaru(namaBus, rute, waktu, harga);
    }

    // Main untuk testing
    public static void main(String[] args) {
        TambahJadwal tambahJadwal = new TambahJadwal();

        // Tambah jadwal secara manual
        tambahJadwal.tambahJadwalBaru("Bus Maju", "LMP - JMB", "08:00 AM", 150000);
        tambahJadwal.tambahJadwalBaru("Bus Cepat", "JMB - LMP", "01:00 PM", 170000);

        // Menampilkan semua jadwal
        tambahJadwal.tampilkanSemuaJadwal();

        // Menambahkan jadwal melalui input pengguna
        tambahJadwal.inputJadwalDariPengguna();

        // Menampilkan semua jadwal setelah penambahan
        tambahJadwal.tampilkanSemuaJadwal();
    }
}
