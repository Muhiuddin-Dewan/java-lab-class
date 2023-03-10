public abstract class User{
    public int id;
    public String firstName;
    public String lastName;
    public void login(){
        System.out.println("simple login");
    }

    public abstract void dashBoard();
}