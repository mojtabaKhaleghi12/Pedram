import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student("hosein", "yadollahi", "1401012268056");
        Student student2 = new Student("amirMohammad", "Sepehri", "1401012268032");
        Student student3 = new Student("pedram", "tbdgt", "1401012268005");

        System.out.println("1.sort by firstname\n" +
                "2.sort by lastname\n" +
                "3.sort by id\n");
        int n = scanner.nextInt();
        switch (n) {
            case 1: {
                List filan = Student.sortbyfirstname();
                Student.getStudentsString(filan);
                break;
            }
            case 2: {
                List filan1 = Student.sortbylastname();
                Student.getStudentsString(filan1);
                break;
            }
            case 3: {
                List filan2 = Student.sortbyID();
                Student.getStudentsString(filan2);
                break;
            }
        }
    }


}