import java.util.ArrayList;

public class App18 {
    public static void main(String[] args) {
        // khai bao 1 ArrList co ten la arrListString
        // co kieu la String
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        // them cac phan tu su dung phuong thuc add()
        arrListInteger.add(0);
        arrListInteger.add(7);
        arrListInteger.add(1);
        arrListInteger.add(9);
        // duyet theo kich thuoc cua arrListInteger
        // su dung vong lap for duyet theo doi tuong
        // trong do phai cos du lieu cua bien number
        // phai trung voi kieu duw lieu cua arrListInteger
        System.out.println("cac phan tu co trong arrListInteger la:");
        for (int number : arrListInteger) {
            System.out.print(number + "\t");
        }
    }

}