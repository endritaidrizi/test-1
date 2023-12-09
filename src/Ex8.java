public class Ex8 {
    public static void main(String[] args) {
        int sum=0;  // perdoret varibli i init 0 ne rastet me shumatore ndersa ne raste * init me 1
        for(int i=5;i<=459*2;i+=2)
        {  sum+=i; }
        System.out.println("sum:" +sum);
    }
}
