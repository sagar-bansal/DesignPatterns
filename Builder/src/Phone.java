public class Phone {
    private int model;
    private int battery;
    private String name;

    public Phone (int model,int battery,String name){
        this.model=model;
        this.battery=battery;
        this.name=name;
    }
    @Override
    public String toString()
    {
        return ("name "+name+"  battery "+battery+" model "+model);
    }

//    public Phone build(){
//        return new Phone(model,battery,name);
//    }


}
