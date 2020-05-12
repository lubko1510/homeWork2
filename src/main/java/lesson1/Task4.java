package main.java.lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом do () while
*/

public class Task4 {

    public static void main(String[] args) {
        String s = "Lubko ";

        int y=0;

        do {
           int x=0;
            do{
                System.out.print(s);
                x++;
            }
            while (x < 10);
            System.out.println();
            y++;
        }
        while (y < 5);

    }
}