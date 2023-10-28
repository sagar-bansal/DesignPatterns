public class Main {
    public static void main(String[] args) {

//        Employee emp=new AndroidDeveloper();
//        Employee emp2=new JavaDeveloper();

        Employee emp=Factory.getEmployees("Java");
        System.out.println(emp.salary());
    }
}