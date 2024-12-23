package com.najwa.pemesanantiketbus;

import java.util.ArrayList;
import java.util.Scanner;

public class DataRute {

    // Daftar rute bus
    private ArrayList<String> daftarRute;

    // Constructor
    public DataRute() {
        this.daftarRute = new ArrayList<>();
    }

    // Metode untuk menambahkan rute baru
    public void tambahRute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama rute baru: ");
        String ruteBaru = scanner.nextLine();

        // Cek apakah rute sudah ada
        if (daftarRute.contains(ruteBaru)) {
            System.out.println("Rute sudah ada dalam daftar!");
        } else {
            daftarRute.add(ruteBaru);
            System.out.println("Rute berhasil ditambahkan!");
        }
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

    // Metode untuk mengedit rute yang ada
    public void editRute() {
        Scanner scanner = new Scanner(System.in);

        if (daftarRute.isEmpty()) {
            System.out.println("Tidak ada rute yang bisa diedit.");
            return;
        }

        System.out.print("Masukkan nomor rute yang ingin diedit: ");
        int nomorRute = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi karakter newline

        if (nomorRute < 1 || nomorRute > daftarRute.size()) {
            System.out.println("Nomor rute tidak valid.");
        } else {
            System.out.print("Masukkan nama rute baru: ");
            String ruteBaru = scanner.nextLine();
            daftarRute.set(nomorRute - 1, ruteBaru);
            System.out.println("Rute berhasil diubah!");
        }
    }

    // Metode untuk menghapus rute
    public void hapusRute() {
        Scanner scanner = new Scanner(System.in);

        if (daftarRute.isEmpty()) {
            System.out.println("Tidak ada rute yang bisa dihapus.");
            return;
        }

        System.out.print("Masukkan nomor rute yang ingin dihapus: ");
        int nomorRute = scanner.nextInt();

        if (nomorRute < 1 || nomorRute > daftarRute.size()) {
            System.out.println("Nomor rute tidak valid.");
        } else {
            daftarRute.remove(nomorRute - 1);
            System.out.println("Rute berhasil dihapus!");
        }
    }

    // Main untuk menjalankan demo
    public static void main(String[] args) {
        DataRute dataRute = new DataRute();
        Scanner scanner = new Scanner(System.in);

        try {
            int pilihan;
            do {
                System.out.println("\n=== Menu Data Rute ===");
                System.out.println("1. Tambah Rute");
                System.out.println("2. Tampilkan Rute");
                System.out.println("3. Edit Rute");
                System.out.println("4. Hapus Rute");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Pilihan harus berupa angka. Silakan coba lagi.");
                    scanner.next(); // Mengabaikan input yang salah
                }
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Mengonsumsi karakter newline

                switch (pilihan) {
                    case 1:
                        dataRute.tambahRute();
                        break;
                    case 2:
                        dataRute.tampilkanRute();
                        break;
                    case 3:
                        dataRute.editRute();
                        break;
                    case 4:
                        dataRute.hapusRute();
                        break;
                    case 5:
                        System.out.println("Terima kasih!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid, silakan coba lagi.");
                }
            } while (pilihan != 5);
        } finally {
            scanner.close();
        }
    }
}

