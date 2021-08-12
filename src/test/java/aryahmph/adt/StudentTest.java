package aryahmph.adt;

import org.junit.jupiter.api.Test;

public class StudentTest {
    private Student student;

    @Test
    void TestStudent() {
        student = new Student("Arya Yunanta", "0909090", "Sriwijaya University");
        System.out.println(student);

        student.sayHello();

        student.setName("Anonymous");
        student.setNim("0101010101");
        student.setUniversity("Indralaya University");
        System.out.println(student);
    }
}
