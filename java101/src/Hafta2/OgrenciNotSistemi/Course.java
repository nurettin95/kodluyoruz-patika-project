package Hafta2.OgrenciNotSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }
        else{
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor.");
        }
    }

    public void printTeacher(){
        this.teacher.print();
    }
}
