 import java.util.Scanner;

public class Gaji{
    public static int masaKerja;
    public static int hitungGaji(){
           int gaji ;
           if (masaKerja < 5) {
               gaji = 5000000;
           } 
           else if (masaKerja >= 5 && masaKerja <=10) {
               gaji = 7500000;
           } 
           else {
               gaji = 10000000;
           }
           return gaji;
       }
 
    public static int hitungLembur (int jamLembur){
        int lemburPerJam;
        int totalJamLembur;
        if (masaKerja <= 5) {
            lemburPerJam = 40000;
            totalJamLembur = lemburPerJam * jamLembur;
        } else if (masaKerja >= 5 && masaKerja <= 10) {
            lemburPerJam = 50000;
            totalJamLembur = lemburPerJam * jamLembur;
        } else {
            lemburPerJam = 75000;
            totalJamLembur = lemburPerJam * jamLembur;
        }
        return totalJamLembur;
    }
 
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        masaKerja = input.nextInt();
        int jamLembur = input.nextInt();

        /* Pekerjaan anda mulai dari sini */
        hitungGaji();
        hitungLembur(jamLembur);
        System.out.println(hitungGaji() + hitungLembur(jamLembur));
        /* Pekerjaan anda berakhir sini */

        System.out.println(Gaji.class.getDeclaredMethods().length);
        System.out.println(Gaji.class.getDeclaredFields().length);
        
    }
    
}
