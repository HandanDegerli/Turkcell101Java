package java101;

public class StringType {
    public static void main(String[] args) {

        String firstName = "John ";
        String lastName = "Smith";
        System.out.println(firstName.charAt(1));
        System.out.println(firstName.toUpperCase());
        System.out.println(firstName.toLowerCase());
        System.out.println(firstName.replace('J', 'P'));
        System.out.println(firstName.length());
        System.out.println(firstName.substring(2));
        System.out.println(firstName + lastName);
        System.out.println(firstName);

    }
}
