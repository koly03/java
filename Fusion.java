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
        int indexOfFirstPart = 0;
        int indexOfSecondPart = 0;
        int indexOfMainArray = 0;
        while(indexOfFirstPart < firstSize && indexOfSecondPart < secondSize){
            if (firstHalf.get(indexOfFirstPart) <= secondHalf.get(indexOfSecondPart)) {
                list.set(indexOfMainArray,(firstHalf.get(indexOfFirstPart)));
                indexOfFirstPart++;
            }
            else{
                list.set(indexOfMainArray,(secondHalf.get(indexOfSecondPart)));
                indexOfSecondPart++;
            }
            indexOfMainArray++;
        }
            
        while(indexOfFirstPart < firstSize){
            list.set(indexOfMainArray, firstHalf.get(indexOfFirstPart));
            indexOfFirstPart++;
            indexOfMainArray++;
        }

        while(indexOfSecondPart < secondSize){
            list.set(indexOfMainArray,secondHalf.get(indexOfSecondPart));
            indexOfSecondPart++;
            indexOfMainArray++;
        }
    }
}




    