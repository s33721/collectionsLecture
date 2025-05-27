public class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
    public int hashCode(){
        return firstName.hashCode() + lastName.hashCode();
    }
}

