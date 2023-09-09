package Week4;

public class Course2 {

    private String courseName;
    private String code;
    private Instructor instructor;

    public Course2(String courseName, String code, Instructor instructor) {
        this.courseName = courseName;
        this.code = code;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    //Course uses a Student (Course sınıfı Student sınıfına bağlı)
    public double calcAvarage(Student[] studens){
        Student st4 = new Student("","","","",123);
        double avarage = 0.0;
        for(int i = 0; i < studens.length; i++){
            avarage += studens[i].getNote();
        }
        return avarage / studens.length;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
