import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(5);
    list.add(1);
    list.add(8);
    list.add(4);
    // list.add(4);
    Fusion list1 = new Fusion(list);
    list1.mergeSort();
    // System.out.println("Before sorting - " + list1);
    // list1.sorting();
    // System.out.println("After sotring - " + list1);
    ;

  }
}