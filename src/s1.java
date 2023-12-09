import java.util.Scanner;

public class s1 {
    public static String varString;
    public static char newLine='\n';
    public static void main(String[] args) {
        varString="endrita";
        System.out.println(varString+newLine+varString);
        System.out.println(varString);
        int e=25;
        e%=3; /// more PRO
        System.out.println(++e); String tt="eni"; tt+="test";
        System.out.println(tt);
        Scanner sc = new Scanner(System.in); String someString=sc.nextLine();
        System.out.println(someString);
    }
}