package Employee;

import Person.Person;

public class Employee extends Person {
    // Loại nhân viên
    protected final int NHAN_VIEN_SEP = 1;
    protected final int NHAN_VIEN_LINH = 2;
    // Lương nhân viên
    protected final long LUONG_NHAN_VIEN_FULL_TIME_SEP = 20000000; // Lương tháng của sếp
    protected final long LUONG_NHAN_VIEN_FULL_TIME_LINH = 10000000; // Lương tháng của lính
    protected final long LUONG_LAM_THEM_MOI_NGAY = 800000; // Làm thêm mỗi ngày của nhân viên toàn thời gian được 800 k
    protected final long LUONG_NHAN_VIEN_PART_TIME_MOI_GIO = 100000; // Lương nhân viên thời vụ mỗi giờ 100 k

    protected long luong;

    public Employee() {
    }

    protected String loaiNhanVien() {
        // Lớp con phải có override để lo vụ loại nhân viên này
        return "";
    }

    protected void nhapttEmployee() {
        nhaptt();
    }

    protected void inttEmployee() {
        intt();
        System.out.println("- Loại nhân viên: " + loaiNhanVien());
        System.out.println("- Lương: " + luong + " VND");
    }
}