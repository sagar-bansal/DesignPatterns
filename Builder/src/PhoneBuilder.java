public class PhoneBuilder {

    private int model;
    private int battery;
    private String name;

    public PhoneBuilder setModel(int model){
        this.model=model;
        return this;
    }
    public PhoneBuilder setBattery(int battery){
        this.battery=battery;
        return this;
    }

    public PhoneBuilder setName(String name){
        this.name=name;
        return this;
    }

    public Phone getPhone(){
        return new Phone(model,battery,name);
    }


}
