import java.util.ArrayList;
import java.util.List;



public class MyArrayListTest {


    public static void main(String a[]) {

        MyArrayList<Integer> mal = new MyArrayList<Integer>();
        mal.add(2);
        mal.add(5);
        mal.add(1);
        mal.add(23);
        mal.add(14);

        for(int i=0; i < mal.size(); i++) {

            System.out.print(mal.get(i)+ " ");
        }

        mal.add(29);
        System.out.println("Element at Index 5:" + mal.get(5));
        System.out.println("List size: " + mal.size());
        mal.remove(2);
        System.out.println("Removing element at index 2");
        System.out.println("List size: " + mal.size());

        for(int i=0; i < mal.size(); i++) {

            System.out.print(mal.get(i) + " ");
        }
    }



}