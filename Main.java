import java.util.Random;
import java.util.LinkedList;
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {

    LinkedList<Integer> list = new LinkedList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    Random randomNumbers = new Random();

    for (int i = 0; i < 10; i++) {
      list2.add(randomNumbers.nextInt(1000));
      list.add(randomNumbers.nextInt(1000));
    }

    
    
    // class Bulle tests
    // Bulle list2 = new Bulle(list);

    // System.out.println("Before sorting   " + list2 + "\n\n");
    // list2.bulleSorting();
    // System.out.println("After sorting    " + list2 + "\n\n");
    


    // class Fusion test
    // System.out.println("Before sorting   " + list + "\n\n");
    // // System.out.println();
    // list = Fusion.mergeSort(list);
    // System.out.println("After sorting   " + list + "\n\n");


    // class QuickSort test
    // QuickSort list3 = new QuickSort(list2, 0, list2.size()-1); 
    // System.out.println("Before sorting   " + list3 + "\n\n");
    // list3.quickSorting(list2, 0, list2.size()-1);
    // System.out.println("After sorting   " + list3 + "\n\n");


    // class HeapSort test
    HeapSort list3 = new HeapSort(list2);
    System.out.println("Before sorting  " + list3 + "\n\n");
    list3.heapSort(list2);
    System.out.println("After sorting   " + list3 + "\n\n");
  }
}