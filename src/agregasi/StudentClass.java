package agregasi;

public class StudentClass {
    //Membuat Variabel
    int rollNum;
    String studentName;
    //Creating HAS-A Relationship With Address Class
    Address studentAddress;

    StudentClass (int rollNum, String studentName, Address studentAddress) {
        this.rollNum = rollNum;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public static void main(String[] args) {
        Address address = new Address(8,"Bengkalis", "Riau", "Indonesia");
        StudentClass obj = new StudentClass(123, "Budi Gunawan", address);
        System.out.println("Roll Number     : " +obj.rollNum);
        System.out.println("Student Name    : " +obj.studentName);
        System.out.println("Student Number  : " +obj.studentAddress.streetNum);
        System.out.println("City            : " +obj.studentAddress.city);
        System.out.println("State           : " +obj.studentAddress.state);
        System.out.println("Country         : " +obj.studentAddress.country);
    }
}
