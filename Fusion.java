import java.util.LinkedList;

public class Fusion{
    public LinkedList<Integer> list = new LinkedList<>();

    public Fusion(LinkedList<Integer> list) {
        this.list= list;
      }
    



    public static void divisionOfArray(LinkedList<Integer> list){
        int listLength = list.size();

        if (listLength < 2) {
            return;
        }


        int middleIndex = list.size() / 2;
        LinkedList<Integer> firstHalf = new LinkedList<>();
        LinkedList<Integer> secondHalf = new LinkedList<>();

        for (int i = 0; i < middleIndex; i++) {
            firstHalf.add(list.get(i));
        }
        for (int i = middleIndex; i < listLength; i++) {
            secondHalf.add(list.get(i));
        }

        divisionOfArray(firstHalf);
        divisionOfArray(secondHalf);

        mergeSort(list, firstHalf, secondHalf);

     }


        public static void mergeSort(LinkedList<Integer> list,  LinkedList<Integer> firstHalf, LinkedList<Integer> secondHalf){
            int firstSize = firstHalf.size();
            int secondSize = secondHalf.size();
            int i = 0, j = 0, k = 0 ;
            while(i < firstSize && j < secondSize){
               if (firstHalf.get(i) <= secondHalf.get(j)) {
                    list.set(k,(firstHalf.get(i)));
                    i++;
               }
               else{
                    list.set(k,(firstHalf.get(j)));
                    j++;
               }
               k++;
            }
            
            while(i < firstSize){
                list.set(k, firstHalf.get(i));
                i++;
                k++;
            }

            while(j < firstSize){
                list.set(k,secondHalf.get(j));
                j++;
                k++;
            }
        }




    // public void mergeSort(){
    //     LinkedList<Integer> firstHalf = new LinkedList<>();
    //     LinkedList<Integer> secondHalf = new LinkedList<>();
    //     divisionOfArray(list, firstHalf, secondHalf);

    //     for (int i = 0; i < .length; i++) {
            
    //     }
    // }
}




    //     for (int i = 0; i < list.size()-1; i+=2) {
    //         firstHalf.add(list.get(i));
    //         secondHalf.add(list.get(i+1));
    //     }
    
    //     if (list.size() % 2 != 0) {
    //     firstHalf.add(list.get(list.size()-1));
    //     }