package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом while
*/

public class Task3 {

    public static void main(String[] args) {
        String s = "Lubomyr ";
        int r =0;

        while (r < 5){
            int t =0;
            while (t < 10){
                System.out.print(s);
                t++;
            }
            System.out.println();
            r++;
        }
    }
}