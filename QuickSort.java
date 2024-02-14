import java.util.ArrayList;

public class QuickSort {
    public QuickSort(ArrayList<Integer> list, int g, int d){
        this.list = list;
        this.g = g;
        this.d = d;
    }
    ArrayList<Integer> list = new ArrayList<>();
    int g = 0;
    int d = list.size() - 1;

    public void quickSorting(ArrayList<Integer> list, int g, int d){
       if (g < d) {
            int a = g;
            int b = d;
            int pivot = list.get((a+b)/2);
            while (a <= b) {
                while (list.get(a) < pivot) {
                    a += 1;
                }
                while (list.get(b) > pivot) {
                    b -= 1;
                }
                if (a <= b) {
                    permuter(list, a, b);
                    a += 1;
                    b -= 1;
                }
            }
            quickSorting(list, g, b);
            quickSorting(list, a, d);
       }
    }




    public void permuter(ArrayList<Integer> list, int element1, int element2) {
        Integer x = list.get(element1);
        list.set(element1, list.get(element2));
        list.set(element2, x);
      } 


     public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
          str.append(list.get(i));
          if (i < list.size() - 1) {
            str.append(", ");
          }
        }
        str.append("]");
        return str.toString();
      }
}
