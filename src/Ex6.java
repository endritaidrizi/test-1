public class Ex6 {
    public static void main(String[] args) {
      //  int a = 10;
     //   while (a > 0) {
     //       System.out.println(a);
     //       a -= 3; // nqs e vendos para sout me siper do te afishoje dhe nje vlere tjeter negative

        for (int j=0;j<10;j++){
            if (j==6){
                break; }
                System.out.println("vlera e j" +j);
            }
        }

   // }

    public static void forLoops() {
        // for (int i = 0; i < 10; ++i)  System.out.println("hello" + i); }
        System.out.println("menyra e re e iterimit ne array");
        String[] array = {"hey", "hi", "Hello"}; // menyra e re e rekomanduar e for each
        for (String el : array) {
            System.out.println(el);
        }
        System.out.println("menyra e dyte gjendet me poshte:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}


