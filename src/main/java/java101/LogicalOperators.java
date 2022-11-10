package java101;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println(b);
        System.out.println(!b);
        System.out.println(b & true);

        //false & false = false
        //false & true = false
        //true & true = true

        //false | false = false
        //false | true = true
        //true | true = true

        System.out.println(b | true);

        System.out.println(b && true);//sol taraftakiye once bakar false sa sagdakını calıstırmaz dırek false doner eger soldakı true ise saga bakar

        System.out.println(b&&test());//shortcut && veya || en basta soldakı doner ona gore

    }

    public static boolean test(){
        System.out.println("Test was worked!");
        return false;
    }
}
