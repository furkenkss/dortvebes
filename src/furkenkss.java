import java.util.Scanner;

public class furkenkss {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        int sayi=input.nextInt();

        System.out.print( sayi+ " sayısından küçük dördün kuvvetleri: ");
        for (int i=1; i<=sayi; i*=4){
            System.out.print(i + "   ");
        }

        System.out.print( sayi+ " sayısından küçük beşin kuvvetleri: ");
        for (int i=1; i<=sayi; i*=5){
            System.out.print(i + "   ");
        }
    }
}
