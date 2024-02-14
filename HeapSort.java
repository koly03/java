import java.util.ArrayList;

public class HeapSort {
    public HeapSort(ArrayList<Integer> list){
        this.list = list;
    }
    ArrayList<Integer> list = new ArrayList<>();
    public void heapSort(ArrayList<Integer> list){
        int n = list.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, i, n);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = list.get(i);
            list.set(i, list.get(0));
            list.set(0, temp);
            heapify(list, 0, i);
        }
    }
    public static void heapify(ArrayList<Integer> list, int i, int n){
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int largest = i;

        if (l < n && (list.get(l) > list.get(largest))){
            largest = l;
        }
        if (r < n && (list.get(r) > list.get(largest))){
            largest = r;
        }
        if (i != largest) {
           int temp = list.get(i);
           list.set(i, list.get(largest));
           list.set(largest, list.get(temp));
           heapify(list,largest, n);
        }
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
