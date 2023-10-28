public class Main {
    public static void main(String[] args) {

        Singleton obj1= Singleton.getObject();

        Singleton obj2=Singleton.getObject();
    System.out.println(obj1.hashCode());
    System.out.println(obj2.hashCode());

    }
}