package ro.siithw2;

public class BubbleSort {
    static void bubbleSort(SalesRepresentative[] arr) {

        //moving through the array from the first element to the last.
        //If the current element is lower than the next we swap it(reassign);

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1].getWorthOfSales() < arr[j].getWorthOfSales()) {
                    int tempObj = arr[j - 1].getWorthOfSales();
                    arr[j - 1].setWorthOfSales(arr[j].getWorthOfSales());
                    arr[j].setWorthOfSales(tempObj);
               }

            }
        }
    }
}
