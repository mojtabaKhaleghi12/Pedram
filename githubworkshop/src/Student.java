import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String SID;
    private static List<Student> Students=new ArrayList<>();
    public Student(String firstName, String lastName, String SID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SID = SID;
        Students.add(this);
    }
    public void add(Student student){
        Students.add(student);
    }

    public static List<Student> getStudents() {
        return Students;
    }

    public static void getStudentsString(List<Student> students) {
        for(Student student : students){
            System.out.println(student.firstName + " " + student.lastName+" "+student.SID);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public static void setStudents(List<Student> students) {
        Students = students;
    }
    public static List sortbyfirstname(){
        List<String>firstnames=new ArrayList<>();
        for(Student student : Students){
            firstnames.add(student.getFirstName());
        }
        Collections.sort(firstnames);
            List<Student>sortedStudents=new ArrayList<>();
        for(String firstname : firstnames){
            for(Student student : Students){
                if(student.getFirstName().equals(firstname)){
                    sortedStudents.add(student);
                }
            }
        }
        return sortedStudents;
    }

    public static List sortbylastname(){
        List<String>lastnames=new ArrayList<>();
        for(Student student : Students){
            lastnames.add(student.getLastName());
        }
        Collections.sort(lastnames);
        List<Student>sortedStudents=new ArrayList<>();
        for(String lastname : lastnames){
            for(Student student : Students){
                if(student.getLastName().equals(lastname)){
                    sortedStudents.add(student);
                }
            }
        }
        return sortedStudents;
    }

    public static List sortbyID(){
        List<String>IDs=new ArrayList<>();
        for(Student student : Students){
            IDs.add(student.getSID());
        }
        Collections.sort(IDs);
        List<Student>sortedStudents=new ArrayList<>();
        for(String ID : IDs){
            for(Student student : Students){
                if(student.getSID()==ID){
                    sortedStudents.add(student);
                }
            }
        }
        return sortedStudents;
    }

}
