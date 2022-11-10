package java101;

import static java.lang.Math.PI;

public class StaticElements {
    /*

    static int i = 1;

    public static void main(String[] args) {
        StaticElements staticElements = new StaticElements();
        staticElements.i =20;
        System.out.println(i);
    }

     */


    static int i;

    static {
        i=20;
        System.out.println("static block is worked");
    }
    public static void main(String[] args) {
        System.out.println(i );

        System.out.println(PI);
    }



}
