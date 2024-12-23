package com.najwa.pemesanantiketbus;

import java.util.ArrayList;
import java.util.Scanner;

public class TambahRute {

    // Daftar rute
    private ArrayList<String> daftarRute;

    // Constructor
    public TambahRute() {
        this.daftarRute = new ArrayList<>();
    }

    // Metode untuk menambahkan rute baru
    public void tambahRute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama rute baru: ");
        String ruteBaru = scanner.nextLine();

        // Menambahkan rute ke daftar
        daftarRute.add(ruteBaru);
        System.out.println("Rute berhasil ditambahkan!");
    }

    // Metode untuk menampilkan semua rute
    public void tampilkanRute() {
        if (daftarRute.isEmpty()) {
            System.out.println("Belum ada rute yang tersedia.");
        } else {
            System.out.println("\nDaftar Rute:");
            for (int i = 0; i < daftarRute.size(); i++) {
                System.out.println((i + 1) + ". " + daftarRute.get(i));
            }
        }
    }

    // Main untuk menjalankan demo
    public static void main(String[] args) {
        TambahRute tambahRute = new TambahRute();
        Scanner scanner = new Scanner(System.in);

        try {
            int pilihan;
            do {
                System.out.println("\n=== Menu Tambah Rute ===");
                System.out.println("1. Tambah Rute");
                System.out.println("2. Tampilkan Rute");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu: ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Pilihan harus berupa angka. Silakan coba lagi.");
                    scanner.next(); // Mengabaikan input yang salah
                }
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Mengonsumsi karakter newline

                switch (pilihan) {
                    case 1:
                        tambahRute.tambahRute();
                        break;
                    case 2:
                        tambahRute.tampilkanRute();
                        break;
                    case 3:
                        System.out.println("Terima kasih!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid, silakan coba lagi.");
                }
            } while (pilihan != 3);
        } finally {
            scanner.close();
        }
    }
}
