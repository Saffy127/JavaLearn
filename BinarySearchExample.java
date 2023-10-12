import java.util.Arrays;
import java.util.List;

public class BinarySearchExample {
    public static int binarySearch(List<Integer> sortedList, int target) {
        int left = 0, right = sortedList.size() - 1;
        System.out.println("Starting binary search for target: " + target);
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("Current middle element: " + sortedList.get(mid));
            
            if (sortedList.get(mid) == target) {
                System.out.println("Target found at index: " + mid);
                return mid;
            }
            
            if (sortedList.get(mid) < target) {
                System.out.println("Target is greater than middle element, adjusting search range.");
                left = mid + 1;
            } else {
                System.out.println("Target is less than middle element, adjusting search range.");
                right = mid - 1;
            }
        }
        
        System.out.println("Target not found in the list.");
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> sortedList = Arrays.asList(1, 2, 3, 4, 5);
        int result1 = binarySearch(sortedList, 3);
        int result2 = binarySearch(sortedList, 6);
        System.out.println("Final Result for 3: " + result1); // should return 2
        System.out.println("Final Result for 6: " + result2); // should return -1
    }
}
