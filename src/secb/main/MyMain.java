/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 26-Mar-20
 *  Time: 12:35 PM
 */
package secb.main;

public class MyMain {
    private int[] arr;

    public MyMain(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        int[] myArray = {25, 2, 8, 60, 5, 10, 15};
        int searchElement = 60;
        MyMain obj = new MyMain(myArray);

        boolean result = obj.linearSearch(searchElement);
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
                //step 5
                break;
            }
        }
        //step 6
        return found;

    }
}
