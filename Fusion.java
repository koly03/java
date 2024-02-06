import java.util.LinkedList;

public class Fusion{
    public LinkedList<Integer> list = new LinkedList<>();

    public Fusion(LinkedList<Integer> list) {
        this.list= list;
      }
    



    public static LinkedList<Integer> mergeSort(LinkedList<Integer> list){
        int listLength = list.size();

        if (listLength < 2) {
            return list;
        }


        int middleIndex = list.size() / 2;
        LinkedList<Integer> firstHalf = new LinkedList<>();
        LinkedList<Integer> secondHalf = new LinkedList<>();

        for (int i = 0; i < middleIndex; i++) {
            firstHalf.add(list.removeFirst());
        }
        for (int i = middleIndex; i < listLength; i++) {
            secondHalf.add(list.removeFirst());
        }
        firstHalf = mergeSort(firstHalf);
        
        secondHalf = mergeSort(secondHalf);

        list = merge(firstHalf, secondHalf);
        return list;
     }
     

    public static LinkedList<Integer> merge(LinkedList<Integer> firstHalf, LinkedList<Integer> secondHalf){
        LinkedList<Integer> list = new LinkedList<>();
        while(!firstHalf.isEmpty() && !secondHalf.isEmpty()){
            if (firstHalf.getFirst() <= secondHalf.getFirst()) {
                list.add(firstHalf.removeFirst());
            }
            else{
                list.add(secondHalf.removeFirst());
            }
        }
            
        list.addAll(firstHalf);
        list.addAll(secondHalf);
        return list;
    }
}




    