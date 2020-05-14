package main.java.lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом for
*/

public class Task2 {

    public static void main(String[] args) {
        //System.out.print(name10Times("Lubko"));
    }

    public static String name10Times(String name) {
        String resultName = "";
        for (int y = 0; y < 5; y++) {
            for (int i = 0; i < 10; i++) {
                if (i < 9) {
                    resultName = resultName + name + " ";
                } else {
                    resultName = resultName + name + "\n";
                }
            }
        }
            return resultName;
        }

}