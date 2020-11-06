import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        try {
            throw new RuntimeException("异常");
        } catch (RuntimeException e) {
            e.getMessage();
        }
        list.stream().forEach(i -> {
            System.out.println("i = " + i);
        });
    }



}
