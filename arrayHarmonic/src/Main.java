import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Diziniz Kaç Elemandan Oluşacaktır ?: ");
        int n = sc.nextInt();
        double [] list = new double[n];
        double sum =0;
        for (int i = 0; i < list.length;i++){
            System.out.print(i + " indisli sayı: ");
            list[i] = sc.nextDouble();

            sum += (1 / list[i]);
        }
        System.out.println("Oluşturukan Dizi: { ");
        for(double sayi: list){
            System.out.print(sayi + ",");
        }
        System.out.println(" }");
        double avarage = (list.length/sum);
        System.out.println("Dizideki Elemanların Harmonik Ortalaması: " + avarage);
    }
}