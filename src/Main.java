import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("John", "Doe", 40);
        Student s2 = new Student("Jane", "Doe", 52);
        Student s3 = new Student("Jack", "Doe", 20);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        Student studentIWantToFindAndRemove = new Student("John", "Doe", 40);
        if (studentIWantToFindAndRemove.equals(s1)) {
            System.out.println("The student is the same");
        }
        HashSet<Student> studentSet = new HashSet<>(students);
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        System.out.println(studentSet.size()); //3 because hashset dont accept duplicates, arraylist does
        if (studentSet.contains(studentIWantToFindAndRemove)) ; //faster than in arraylist
        //hashcode doesnt store in order
        for (Student student : studentSet) {
            System.out.println(student);
        }
        //HashMap
        HashMap<String, Student> map = new HashMap<>();
        map.put("s1234", s1);
        map.put("s4561", s2);
        map.put("s4562", s3);
        Student s = map.get("s1234");
        //collections, works only if student is comparable
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }

        System.out.println("============");
        System.out.println("experiment");
        System.out.println("============");
        //experiment
        boolean works = students.remove(studentIWantToFindAndRemove);
        if (works) {
            System.out.println("Student removed " + studentIWantToFindAndRemove.getFirstName() + " " + studentIWantToFindAndRemove.getLastName());
        }
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }
}