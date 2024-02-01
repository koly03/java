import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    // for (int i = 0; i < 10; i++) {
    //   list.add(null);
    // }
    // list.add(3);
    // list.add(5);
    // list.add(1);
    // list.add(8);
    // list.add(4);
    Fusion list1 = new Fusion(list);
    System.out.println(list);
    System.out.println();
    Fusion.divisionOfArray(list);
    System.out.println(list);

    // System.out.println("Before sorting - " + list1);
    // list1.sorting();
    // System.out.println("After sotring - " + list1);
    

  }
}