public class Ex4 {
    public static void main(String[] args) {

        // kerkesa a
        int intVar1=5, intVar2=6;

        // kerkesa b
        // short eshte ne byte me i vogel se int prandaj do duhet te behet cast
        short shortSum= (short) (intVar1 +intVar2);

        // kerkesa c
        System.out.println(shortSum);

        // kerkesa d
        System.out.println(shortSum++);

        // kerkesa e
        byte byteSum =(byte)(intVar1+intVar2); // ktu do kemi me shume humbje memorie dhe ne kompilim

        // kerkesa f
        System.out.println(byteSum);

        // kerkesa g
        System.out.println(++byteSum);

    }
}
