
package main.java.lesson1;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
public class Task5 {
    public static void main(String[] args) {
       // System.out.println(reverse("Hello world!!!"));
    }

    public static String reverse(String str) {

        String myString ="";

        for (int y = str.length()-1; y >=0; y--){
            myString = myString + str.charAt(y);
        }
        return myString;
    }
}