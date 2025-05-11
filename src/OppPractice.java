class Employee1 {
    int id ;
    String name ;
     int salary;
    public void printEmployee(){
        System.out.println(id);
        System.out.println(name);
       // System.out.println(salary);
    }

    public int getSalary() {
        return salary;
    }
}
public class OppPractice {

    public static void main(String[] args) {
         Employee1 abhay = new Employee1();
         Employee1 ankit = new Employee1();
         abhay.id=1;
        abhay.name="abhay";
        abhay.salary=5550;
        System.out.println();
        abhay.printEmployee();

        ankit.id=2;
        ankit.name="ankit";
        ankit.salary=3300;
        ankit.printEmployee();

      //  System.out.println(abhay.id);
        //System.out.println(abhay.name);
         int ankitSalary= ankit.getSalary();
        System.out.println(ankitSalary);
    }
}
