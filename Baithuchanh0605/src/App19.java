import java.util.ArrayList;
import java.util.ListIterator;

public class App19 {
    public static void main(String[] args) {
        // khai bao 1 ArrayList co ten la arrListString
        // co kieu la String
        ArrayList<Character> arrListchar = new ArrayList<>();
        // them phan tu su dung phuong thuc add()
        arrListchar.add('a');
        arrListchar.add('e');
        arrListchar.add('b');
        arrListchar.add('c');
        ListIterator<Character> listIterator = arrListchar.listIterator();

        System.out.println("cac phan tu co trong arrListchar la:");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "\t");

        }
    }
}