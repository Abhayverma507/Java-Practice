public class MethodOverloading {
    static void tellJoke(){
        System.out.println("i am a body");
    }
     static void changes(int []arr){
        arr[0]=54;
        arr[1]=43;
     }

    static void method1(){
        System.out.println("hello");
    }
    static void method1(String name){
        System.out.println("hello"+name);
    }

    public static void main(String[] args) {
  //      tellJoke();
     int [] marks={33,33,33,33};
      changes(marks);
        System.out.println(marks[0]);

        //MethodOverloading
        method1();
        method1("abhay");

    }
}
