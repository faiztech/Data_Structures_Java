

public class MyStringBuilderTest {


    public static void main(String a[]) {

		long NANOSECOND_IN_MILLISECOND = 1000000;

        long startTime = System.nanoTime();

        MyStringBuilder testString = new MyStringBuilder("Hello");

        System.out.println("\nInitial Size of the String: " + testString.size());

        System.out.println(testString.toString());

        testString.append(" Faiz");

        System.out.println(testString.toString());

        testString.append(", How are you doing today?");
        
        System.out.println("\nFinal Size of the String: "  + testString.size());

        System.out.println(testString.toString());

        System.out.println("\nTime elapsed: " + (System.nanoTime() - startTime) / NANOSECOND_IN_MILLISECOND + " milliseconds");

    }

}