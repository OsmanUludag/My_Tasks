package junior_tasks01;

import java.util.Scanner;

public class Question3 {
    /*

    Aritmetik operatör kullanmadan iki pozitif sayıyı toplama nasıl yapılabilir?

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz");
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.println("işlem sonucu : " + add(num1, num2));

    }
    public static int add(int a, int b){
        return Math.addExact(a,b);
    }
}
