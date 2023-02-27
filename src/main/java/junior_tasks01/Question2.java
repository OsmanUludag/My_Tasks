package junior_tasks01;

import java.util.Scanner;

public class Question2 {

    /*

    Geliştirdiğim "isUnique" algoritmasını herhangi bir veri yapısı içermeyecek şekilde şöyle yapabilirim:
    Burada yazdığım metod her karakteri diğer karakterlerle karşılaştırarak bir karakterin yalnızca
    bir kere geçip geçmediğini kontrol eder.İki tane for döngüsü vardır.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir ifade giriniz");
        String str = input.nextLine();
        System.out.println(str + " isUnique = " + isUniqueNoCollection(str));

    }
    public static boolean isUniqueNoCollection(String str){
        for (int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            for (int j = i+1; j<str.length(); j++){
                if(c == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
