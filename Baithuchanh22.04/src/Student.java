package Student;

import Person.Person;

public class Student extends Person {
    protected String Msv;
    protected String Lop;
    protected String HinhThucHoc;

    protected void nhapttSudent() {
        nhaptt();
        System.out.print("Lớp: ");
        Lop = sc.nextLine();
        System.out.print("Mã sinh viên: ");
        Msv = sc.nextLine();
    }

    protected void inttStudent() {
        intt();
        System.out.println("Lớp: " + Lop);
        System.out.println("Mã sinh viên: " + Msv);
    }
}