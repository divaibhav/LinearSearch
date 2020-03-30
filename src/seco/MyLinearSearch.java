/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Mar-20
 *  Time: 2:41 PM
 */
package seco;

/*
Algorithm : linearSearch(searchElement)
Start:
Step 1: 	found = false
Step 2: 	iterate over each “element” of data structure and 		perform step 3
Step 3: 	if(searchElement == element)
			then perform step 4 & step 5.
Step 4 : 	found = true
Step 5: 	break
Step 6: 	return found
 */
public class MyLinearSearch {
    private int[] arr;

    public MyLinearSearch(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        int[] array = {26, 2, 8, 60, 10, 15, 5};
        int searchElement = 50;
        MyLinearSearch object = new MyLinearSearch(array);
        boolean result = object.linearSearch(searchElement);

        if (result) {
            System.out.println("element found");
        } else {
            System.out.println("element not found");
        }

    }

    public boolean linearSearch(int searchElement) {
        //step 1
        boolean found = false;
        //step 2
        for (int i = 0; i < arr.length; i++) {
            //step 3
            if (searchElement == arr[i]) {
                //step 4
                found = true;
                //step5
                break;
            }

        }
        //step 6
        return found;
    }
}
