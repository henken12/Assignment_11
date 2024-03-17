package Assignment11;

public class Student {

        private String firstName;
        private String lastName;
        private double gpa;
        private String studentClass;

        public Student(String firstName, String lastName, double gpa, String studentClass) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gpa = gpa;
            this.studentClass = studentClass;
        }


        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGpa() {
            return gpa;
        }

    }

