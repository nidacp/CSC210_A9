import java.util.ArrayList;
import java.util.Arrays;

public class HeapTest {
    /*
     * Create a heap `h` and insert 10 or so random numbers (ideally they should not be in order). Print out the heap after each insertion so you can check that it is developing properly.
    * Pop a few elements off the heap.  Make sure that you are getting the largest remaining value each time and that the heap structure is updated properly after the root is removed.
     */
    public static void main(String[] args) {
        /*Heap<Integer> h = new Heap<>();

        System.out.println("Populating heap:\n");
        for(int i=0; i<10; i++) {
            h.insert((int)(Math.random()*20));
            h.print();
        }
        System.out.println("Depopulating heap: (size is now " + h.size() + ") \n");
        while(h.size()>0) {
            h.popTop();
            h.print();
        }
        System.out.println("Everything is done!");*/

        //Integer arr[] = {-2,3,9,-7,1,2,6,-3};
        Integer arr[] = {-2,3,9,-7,1,2,6,-3,-1,2,8,-6,2,3,7,-2};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Unsorted: " + al.toString());
        Heap.heapSort(al);
        System.out.println("Sorted: " + al.toString());
        // Call your heap constructor with `al` passed as an argument
        // Use heap methods to sort the heap
        // Set `al` equal to the ArrayList stored in the heap with heap.getData()
    }
}
