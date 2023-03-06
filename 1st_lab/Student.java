public class Student extends User {
    public double CGPA;
    // public Student(String fname, String lname){
    //     firstName = fname;
    //     lastName = lname;
    // }
    public String getFullName() {
        return(firstName+" "+lastName);
    }
}
