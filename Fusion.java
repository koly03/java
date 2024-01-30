import java.util.ArrayList;

public class Fusion{
    public ArrayList<Integer> list = new ArrayList<>();

    public Fusion(ArrayList<Integer> list) {
        this.list= list;
      }

      public void mergeSort(){
        ArrayList<Integer> firstHalf = new ArrayList<>();
        ArrayList<Integer> secondHalf = new ArrayList<>();

        
            for (int i = 0; i < list.size()-1; i+=2) {
                firstHalf.add(list.get(i));
                secondHalf.add(list.get(i+1));
            }
        
        if (list.size() % 2 != 0) {
            firstHalf.add(list.get(list.size()-1));
        }
        System.out.println(firstHalf);
        System.out.println(secondHalf);
      }
}


