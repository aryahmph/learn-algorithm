package aryahmph.adt;

public class Student {
    private String name;
    private String nim;
    private String university;

    public Student(String name, String nim, String university) {
        this.name = name;
        this.nim = nim;
        this.university = university;
    }

    void sayHello() {
        System.out.printf("Hello my name is %s, I study at %s\n", this.name, this.university);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", nim='" + nim + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
