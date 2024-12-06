import java.util.Scanner;
import java.util.ArrayList;

public class Hitung{

    public static ArrayList<Integer> data = new ArrayList<>();
    public static int nilaiMin (ArrayList<Integer> data){
        int datamin = data.get(0);
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i)< datamin) {
                datamin = data.get(i);
            }
        }
        return datamin;
    }

    public static int nilaiMax (ArrayList<Integer> data){
        int datamax = data.get(0);
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) > datamax) {
                datamax = data.get(i);
            }
        }
        return datamax;
    }

    public static double rataRata (ArrayList<Integer> data){
        double total=0;
        for (int i = 0; i < data.size(); i++) {
                total += data.get(i);

        }
        double dataAVG = total / data.size();
        return dataAVG;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /* Pekerjaan anda mulai dari sini */
    String konfirmasi = " ";
       do {
        int jmlhNilai = input.nextInt();
        data.add(jmlhNilai);

           konfirmasi = input.next();

           if (konfirmasi.equalsIgnoreCase("N")) {
            break;
           }

       } while (konfirmasi.equalsIgnoreCase("Y"));
        

        System.out.println("Nilai minimal : " + nilaiMin(data));
        System.out.println("Nilai maksimal : " + nilaiMax(data));
        System.out.println("Nilai rata-rata : " + rataRata(data));
        /* Pekerjaan anda berakhir sini */
        System.out.println(Hitung.class.getDeclaredMethods().length);
        System.out.println(Hitung.class.getDeclaredFields().length);
    }
}
