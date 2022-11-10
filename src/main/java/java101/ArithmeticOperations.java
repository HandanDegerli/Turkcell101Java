package java101;

public class ArithmeticOperations {
    //++x=prefix once operator ıslemi sonra deger alınır

    //x++=postfix deger alınır ardından operator işlemi

    public static void main(String[] args) {
/*
        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println(z);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(y/x);
        System.out.println(5%2);

        int a = 10;
        a += 2;
        System.out.println(a);

        int q = 12;
        //System.out.println(q++);
        //System.out.println(q);
        System.out.println(++q);
        System.out.println(q);

 *///bitwise
        int i = 10; // 00000000 00000000 00000000 00001010
        System.out.println(~i);//tilda operatoru-0lar 1 olur
        int x = 4; // 00000000 00000000 00000000 00000100
        System.out.println(i&4);//00000000 00000000 00000000 00000000(and operatoru 0&0 =0, 1&0=0, 1&1=1)

        System.out.println(i|4);//00000000 00000000 00000000 00000000(and operatoru 0|0 =0, 1|0=1, 1|1=1= 2 üzeri 3 toplamı 14)

        System.out.println(x >> 1);//saga dogru shiftleyince sağdaki 0 atılır basa 0 eklenir ve 2 üzeri 1 den cevap 2 =>sayıyı saga dogru shıftlersen 2 ye boler sola yaparsan 2 ile carparsın demek

    }
}
