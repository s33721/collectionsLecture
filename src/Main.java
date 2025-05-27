import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("John", "Doe");
        Student s2 = new Student("Jane", "Doe");
        Student s3 = new Student("Jack", "Doe");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        Student studentIWantToFindAndRemove = new Student("John", "Doe");
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
        if(studentSet.contains(studentIWantToFindAndRemove)); //faster than in arraylist
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



        //experiment
        boolean works = students.remove(studentIWantToFindAndRemove);
        if (works){
            System.out.println("Student removed " + studentIWantToFindAndRemove.toString());
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}