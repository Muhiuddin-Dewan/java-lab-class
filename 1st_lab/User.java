public class User {
    public String firstName = "outside the method";
    public String lastName;
    public String middleName;
    private int id;

    public void login(String firstName){
        // loging using user and pwd
        // System.out.println("normal login");
        this.firstName = firstName;
        System.out.println(firstName);
    }
}
