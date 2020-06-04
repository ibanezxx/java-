package homework.ten;

public class Course {
    private String courseName;
    private String[] students=new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName=courseName;
    }

    public String[] addStudent(String student){
        students[numberOfStudents]=student;
        numberOfStudents++;
        String[] addStudents=new String[numberOfStudents];
        for(int i=0;i<numberOfStudents;i++){
            addStudents[i]=students[i];
        }
        return addStudents;
    }

    public String[] getStudents(){
        String[] getStudents=new String[numberOfStudents];
        for(int i=0;i<numberOfStudents;i++){
            getStudents[i]=students[i];
        }
        return getStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] dropStudent(String student){
        students[numberOfStudents]=null;
        numberOfStudents--;
        String[] dropStudents=new String[numberOfStudents];
        for(int i=0;i<numberOfStudents;i++){
            dropStudents[i]=students[i];
        }
        return dropStudents;
    }
    public String[] clear(){
        for(int i=0;i<students.length;i++){
            students[i]=null;
        }
        numberOfStudents=0;
        return students;
    }
}
