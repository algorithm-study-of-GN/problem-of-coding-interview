
public class SortAlgorithm {
	
    public void BubbleSort() throws Exception {
        int[] array = new int[] {4,2,10,35,3,12,54,23};
        int temp = -1;

        for(int count : array){
            System.out.print(count + ",");

        }

        System.out.println("");

        for(int q = array.length; q > 0; q--) {
            for (int i = 0; i < q -1; i++) {
                int comparePos = i + 1;

                if (array[i] > array[comparePos]) {
                    temp = array[comparePos];
                    array[comparePos] = array[i];
                    array[i] = temp;
                }
            }
        }

        for (int count : array){
            System.out.print(count + ",");
        }
    }
    
    public void SelectionSort() throws Exception {
        int[] array = new int[] {4,2,10,35,3,12,54,23};
        int temp = -1;
        int minValue = Integer.MAX_VALUE;
        int selectIdx = -1;

        for(int count : array){
            System.out.print(count + ",");
        }

        System.out.println("");

        for(int i = 0; i < array.length - 1; i++){
            minValue = array[i];
            for(int q = i + 1; q < array.length; q ++){
                if(array[q] < minValue){
                    minValue = array[q];
                    selectIdx = q;
                }
            }

            temp = array[selectIdx];
            array[selectIdx] = array[i];
            array[i] = temp;
        }

        for(int count : array){
            System.out.print(count + ",");
        }
    }
}
