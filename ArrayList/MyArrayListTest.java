

public class MyArrayListTest {


    public static void main(String a[]) {

        long NANOSECOND_IN_MILLISECOND = 1000000;
        long startTime = System.nanoTime();


        MyArrayList<Integer> mal = new MyArrayList<Integer>();

        System.out.println("----Adding elements to the List: ");

        mal.add(2);
        mal.add(5);
        mal.add(1);
        mal.add(23);
        mal.add(14);
        mal.add(29);

		System.out.println("----Elements in the List: ");
        for(int i=0; i < mal.size(); i++) {

            System.out.print(mal.get(i)+ " ");
        }

        System.out.println("\n\n----Element at Index 5: " + mal.get(5));
        System.out.println("----List size: " + mal.size());
        mal.remove(5);
        System.out.println("\n----Removing element at index 5");
        System.out.println("----List size after removal: " + mal.size());

        for(int i = 0; i < mal.size(); i++) {

            System.out.print(mal.get(i) + " ");
        }

        System.out.print("\n");
        System.out.println("\nTime elapsed: " + (System.nanoTime() - startTime) / NANOSECOND_IN_MILLISECOND + " milliseconds");


    }





}