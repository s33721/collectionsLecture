public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student anotherStudent = (Student) obj;
            return firstName.equals(anotherStudent.firstName) && lastName.equals(anotherStudent.lastName);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode();
    }

    @Override
    public int compareTo(Student someStudent) {
        //-1 if age is smaller than another student
        //0 if ages are equal
        //+1 if age is bigger than another student
        if (age < someStudent.age) {
            return -1;
        } else if (age == someStudent.age) {
            return 0;
        }
        return 1;
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
}

