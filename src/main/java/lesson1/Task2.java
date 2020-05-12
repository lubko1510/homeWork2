package main.java.lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом for
*/

public class Task2 {

    public static void main(String[] args) {
        name10Times();
    }

    public static void name10Times (){
        String myName = "Lubko ";
            for (int y=0; y<5; y++){
                for (int x=0; x<=10; x++){
                    System.out.print(myName);
                }
                System.out.println();
            }
    }
}