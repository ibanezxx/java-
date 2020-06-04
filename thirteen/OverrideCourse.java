package homework.thirteen;

import java.util.Arrays;
import java.util.Calendar;

public class OverrideCourse {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course c1=new Course("java");
        c1.addStudent("张三");
        c1.addStudent("李四");
        Course c2=(Course) c1.clone();
        System.out.println(c1);
        System.out.println(c2);
    }

}

class Course implements Cloneable {
        private String courseName;
        private String[] students = new String[100];
        private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

        public String[] addStudent (String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
        String[] addStudents = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            addStudents[i] = students[i];
        }
        return addStudents;
    }

        public String[] getStudents () {
        String[] getStudents = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            getStudents[i] = students[i];
        }
        return getStudents;
    }

        public int getNumberOfStudents () {
        return numberOfStudents;
    }

        public String getCourseName () {
        return courseName;
    }

        public String[] dropStudent (String student){
        students[numberOfStudents] = null;
        numberOfStudents--;
        String[] dropStudents = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            dropStudents[i] = students[i];
        }
        return dropStudents;
    }
        public String[] clear () {
        for (int i = 0; i < students.length; i++) {
            students[i] = null;
        }
        numberOfStudents = 0;
        return students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", students=" + Arrays.toString(students) +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

