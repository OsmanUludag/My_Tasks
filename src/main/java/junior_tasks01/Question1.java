package junior_tasks01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question1 {

     /*
    Verilen bir String değerinin içerdiği tüm farklı karakterlerin, bu String içerisinde yalnızca bir kere
    bulunup bulunmadığını belirleyen bir algoritma:

    Bu algoritmada öncelikle String parametresinin null veya boş olup olmadığını kontrol ediyorum.Daha sonra
    String içerisindeki karakterleri bir Set yapısı içerisinde topluyorum.Eğer bir karakter daha önce Set içerisinde
    varsa, o zaman o karakter daha önce String içerisinde de var demektir ve bundan dolayı false döndürüyorum.Eğer
    bu kontrolü geçerse o karakter Set'e eklenir ve döngü devam eder.Döngü bittiğinde karakterlerin devam edip etmediği
    kontrol edilip sonuçta true ya da false döndürülür.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz");
        String str = input.nextLine();
        System.out.println(str + " isUnique = " + isUnique(str));

    }
    public static boolean isUnique(String str){

        if (str == null || str.isEmpty() || str.isBlank()){
            throw new IllegalArgumentException("String can not be null or empty");
        }
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : str.toCharArray()){
            if (uniqueChars.contains(c)){
                return false;
            }
            uniqueChars.add(c);
        }
        return true;
    }
}
