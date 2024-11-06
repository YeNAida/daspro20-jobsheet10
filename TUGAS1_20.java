import java.util.Scanner;

public class TUGAS1_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int jumlahResponden, jumlahPertanyaan;
        double totalNilai = 0;

        // Input jumlah responden dan pertanyaan
        System.out.print("Masukkan jumlah responden: ");
        jumlahResponden = input.nextInt();
        System.out.print("Masukkan jumlah pertanyaan: ");
        jumlahPertanyaan = input.nextInt();

        // Input nilai jawaban untuk setiap responden dan pertanyaan
        int[][] nilaiJawaban = new int[jumlahResponden][jumlahPertanyaan];
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Masukkan nilai jawaban responden ke-" + (i + 1) + " pertanyaan ke-" + (j + 1) + ": ");
                nilaiJawaban[i][j] = input.nextInt();
                totalNilai += nilaiJawaban[i][j];
            }
        }

        // Menghitung rata-rata nilai per responden
        for (int i = 0; i < jumlahResponden; i++) {
            int totalResponden = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalResponden += nilaiJawaban[i][j];
            }
            System.out.println("Rata-rata nilai responden ke-" + (i + 1) + ": " + (double) totalResponden / jumlahPertanyaan);
        }

        // Menghitung rata-rata nilai per pertanyaan
        for (int j = 0; j < jumlahPertanyaan; j++) {
            int totalPertanyaan = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                totalPertanyaan += nilaiJawaban[i][j];
            }
            System.out.println("Rata-rata nilai pertanyaan ke-" + (j + 1) + ": " + (double) totalPertanyaan / jumlahResponden);
        }

        // Menghitung rata-rata nilai keseluruhan
        double rataRataKeseluruhan = totalNilai / (jumlahResponden * jumlahPertanyaan);
        System.out.println("Rata-rata nilai keseluruhan: " + rataRataKeseluruhan);
    }
}
