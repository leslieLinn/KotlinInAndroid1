package www.leslie.org.kotlintest;

import java.util.ArrayList;

public interface Output {
    public static class Leg{

    }
    public class Hand{
        public void test() {


            ArrayList<?> list = new ArrayList<String>();

           // list.add("lin");
        }
    }
}


 class Student<T extends Number>{
    T name;

     public static void main(String[] args) {
        Student<? extends Number> stu= new Student<Integer>();
            //删除行 ctrl+shift +l
         Number name= stu.name;
     }






}


