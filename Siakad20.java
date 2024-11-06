import java.util.Scanner;

public class Siakad20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        System.out.println("Masukkan Jumlah Mata Kuliah: ");
        int jumlahmatkul = input.nextInt();
        
        int [] [] nilai = new int[jumlahMahasiswa][jumlahmatkul];

        for (int i = 0; i <nilai.length; i++){
            System.out.println("Input nilai Mahasiswa ke-"+(i+1));
            double totalPersiswa=0;

            for (int j=0;j<nilai[i].length;j++){
                System.out.println("Nilai mata kuliah "+(j+1)+":");
                nilai[i][j]= input.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai Rata-rata Mahasiswa:"+totalPersiswa/3);
        }
        System.out.println("\n===========================");
        System.out.println("Nilai Rata-rata setiap mata kuliah: ");
        for (int j =0; j<3;j++){
            double totalPermatkul =0;

            for(int i=0;i<4;i++){
                totalPermatkul+=nilai [i][j];
            }
            System.out.println("Mata Kuliah "+(j+1)+":"+ totalPermatkul/4);
        }
    }
}
