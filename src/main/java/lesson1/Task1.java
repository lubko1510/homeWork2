package lesson1;

import java.security.PublicKey;

public class Task1 {
    /* Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел.
    */
    public static void main(String[] args) {

        System.out.println(min(5,2,3) + " This is the min number");
        System.out.println(max(10,89,8) + " This is the max number");
    }

    public static int min(int a, int b, int c){

      if (a<b && a<c){
          return a;
      }
      else if (b<a && b<c) {
          return b;
      }
      else {
          return c;
      }
      }

      public static int max(int x, int y, int w){

        if (x > y && x > w){
            return x;
        }
        else if (y > w){
            return y;
        }
        else {
            return w;
        }
      }


}