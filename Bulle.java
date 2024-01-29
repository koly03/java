import java.util.ArrayList;

public class Bulle {
  public Bulle(ArrayList<Integer> list) {
    this.list = list;
  }

  ArrayList<Integer> list = new ArrayList<>();

  public void sorting() {
    for (int i = list.size() - 1; i >= 1; i--) {
      for (int j = 0; j < i; j++) {
        if (list.get(j) > list.get(j + 1)) {
          permuter(list, j, j + 1);
        }
      }
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
