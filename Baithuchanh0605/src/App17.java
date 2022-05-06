import java.util.ArrayList;
import java.util.Iterator;

public class App17 {
    public static void main(String[] args) throws Exception {
        // khai bao 1 ArrayList co ten la arrListString
        // co kieu la String
        ArrayList<Float> arrListFloat = new ArrayList<>();
        // them phan tu su dung phuong thuc add()
        // chu f cho biet cac so them vao la so thuc
        // neu khong co chu nay thi trinh bien dich se hieu day la so double
        // va se bao loi du lieu
        arrListFloat.add(0.7f);
        arrListFloat.add(7.26f);
        arrListFloat.add(1.02f);
        arrListFloat.add(9.3f);
        // khai bao mot Iterator co kieu la Float
        Iterator<Float> iterator = arrListFloat.iterator();
        System.out.println("cac phan tu co trong arrListFloat la:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
    }
}