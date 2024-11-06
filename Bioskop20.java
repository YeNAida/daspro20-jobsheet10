public class Bioskop20 {
    public static void main(String[] args) {
        
        String [][] penonton = new String[4][2]; 
        penonton [0][0]= "Amin";
        penonton [0][1]= "bena";
        penonton [1][0]= "candra";
        penonton [1][1]= "Dela";
        penonton [2][0]= "Eka";
        penonton [2][1]= "Farhan";
        
        penonton [3][0]= "Gisel";
        penonton [3][1]= "Hana";

        System.out.printf("%s \t %s \n", penonton [0][0], penonton [0][1]);
        System.out.printf("%s \t %s \n", penonton [1][0], penonton [1][1]);
        System.out.printf("%s \t %s \n", penonton [2][0], penonton [2][1]);
        System.out.printf("%s \t %s \n", penonton [3][0], penonton [3][1]);  

        System.out.println(penonton.length);
        for (int i =0; i <penonton.length;i++){
            System.out.println("Penonton pada baris ke-"+(i+1)+":"+String.join(",",penonton[i]));
        }

        // for (String [] barispenonton : penonton){
        //     System.out.println( "Pangjang baris:"+barispenonton.length);
        // }

        // System.out.println("Penonton pada baris ke-3: ");
        // for (int i =0; i < penonton[2].length; i++){
        //     System.out.println(penonton[2][i]);

        // System.out.println("Penonton pada baris ke-3: ");
        // for (String i  : penonton[2]){
        //     System.out.println(i);
        // }
    }
}


// tipe data primitif (int,bolean,dan double) tidak bisa bernilai null
// null != 0 karena null = tidak bernilai dan 0 adalah sebuah nilai 
// Mengakses elemen yang bernilai null bisa menyebabkan error 
// Contoh : Jika kita mencoba mengakses nilai dari sebuah elemen yang bernilai null
//          program kita akan mengalami error.

// Array dalam java dapat mengisi elemen array pada indeks manapun sesuai dengan logika program Anda (fleksibilitas)

