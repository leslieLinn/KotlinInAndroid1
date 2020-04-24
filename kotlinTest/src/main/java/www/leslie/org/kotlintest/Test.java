package www.leslie.org.kotlintest;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

    }
    class Hu<T extends Number>{
        List<? super Number> list;
        List<? extends Number> list1;
    }
}
