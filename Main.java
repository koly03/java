import java.util.Random;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {

    LinkedList<Integer> list = new LinkedList<>();
    Random randomNumbers = new Random();

    for (int i = 0; i < 1000000; i++) {
      list.add(randomNumbers.nextInt(1000));
    }
    /*  class Bulle tests
    // Bulle list2 = new Bulle(list);

    // System.out.println("Before sorting   " + list2 + "\n\n");
    // list2.bulleSorting();
    // System.out.println("After sorting    " + list2 + "\n\n");
    */


    // class Fusion test
    System.out.println("Before sorting   " + list + "\n\n");
    // System.out.println();
    list = Fusion.mergeSort(list);
    System.out.println("After sorting   " + list + "\n\n");

  }
}