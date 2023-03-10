public class Student extends User {
    public int age;
    // public Student(String fname, String lname) {
    //     firstName = fname;
    //     lastName = lname;
    // }
    public String fullName(){
        return(firstName+" "+lastName);
    }

    public void dashBoard(){
        System.out.println("Student dashboard");
    }

    public void dashBoard(String fname){
        System.out.print(fname+" dashboad");
    }

    public void login(){
        System.out.println("Student login");
    }

}
