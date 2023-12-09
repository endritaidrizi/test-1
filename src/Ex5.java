public class Ex5 {
    public static void main(String[] args) {
        int a = 10;
    //   if (a == 0)
    //   {System.out.println("nr is 0");}
    //    else if (a % 2 == 0)
    //     {System.out.println("nr is even");}
    //   else {System.out.println( "nr is odd");}

        //

        switch(a){
            case 0:
                System.out.println("case nr is 0");
                break;
            case 8:
                System.out.println("case nr is 8");
                break;
            default:
                System.out.println("case default vlera eshte" + a);
        }
    }
}