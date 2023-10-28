public class Singleton {
    private static Singleton singletonObj;
    private Singleton(){
        if(singletonObj!=null)
        throw new RuntimeException("Double access");
    }

    public  static Singleton getObject(){
        if(singletonObj==null){
            synchronized (Singleton.class) {
                if(singletonObj==null) {
                    singletonObj = new Singleton();
                }
            }
        }
        return singletonObj ;
    }
    public Object readResolve(){
        return singletonObj;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return singletonObj;
    }
}