package Assignment11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();
        students.add(new Student("fani", "geb", 3.5, "stc"));
        students.add(new Student("sam", "natnael", 3.8, "fpp"));
        students.add(new Student("hen", "abel", 3.2, "mpp"));


        HashMap<Key, Student> studentMap = Admin.processStudents(students);
        double averageGPA = Admin.computeAverageGPA(studentMap);


        System.out.println("Average GPA: " + averageGPA);
    }
}

