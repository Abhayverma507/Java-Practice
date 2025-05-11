
class MyEmployee1{
    int id  ;
    String name ;

    public MyEmployee1(){
        id =4;
        name="ankit";
    }
    public MyEmployee1(int myId  ){
        id =myId;
        name="abhay";
    }
    public MyEmployee1(int myId ,String myName ){
        id =myId;
        name=myName;
    }
    public  void setId(int i){
        this. id=i;
    }
    public int getId(){
        return id;

    }
    public  void setName(String n){
        name=n;
    }
    public String getName(){
        return name;

    }
}


public class MyEmployee {
    public static void main(String[] args) {
            MyEmployee1 abhay = new MyEmployee1(43,"karan");
               //   abhay.setId(1);
           // abhay.setName("Employee name is abhay ");
       System.out.println(abhay.getId());
        System.out.println(abhay.getName());

    }
}
