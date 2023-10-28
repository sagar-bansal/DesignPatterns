public class Factory {
    public static Employee getEmployees(String role){
        if(role.equalsIgnoreCase("Android"))
            return new AndroidDeveloper();
        else if(role.equalsIgnoreCase("Java"))
            return new JavaDeveloper();
        else return new Employee() {
                @Override
                public int salary() {
                    return 0;
                }
            };
    }
}
