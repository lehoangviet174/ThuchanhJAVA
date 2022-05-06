import java.util.ArrayList;

public class App21 {
    public static void main(String[] arrgs) {
        ArrayList<String> color = new ArrayList<String>(3);

        color.add("red");
        color.add("Blue");
        color.add("Green");
        color.add("Orange");
        color.add("Pink");
        color.add("Green");
        color.add("Yellow");

        System.out.print(color.get(1));
        System.out.print(color.contains("Orange"));
        System.out.print(color.size());
        System.out.print(color);
    }

}
