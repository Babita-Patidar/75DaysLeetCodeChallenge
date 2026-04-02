import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] tempArray) {
        int length = tempArray.length;
        int[] result = new int[length];
        Stack<Integer> indexStack = new Stack<>(); 

        for (int currentDay = 0; currentDay < length; currentDay++) {

            while (!indexStack.isEmpty() && 
                   tempArray[currentDay] > tempArray[indexStack.peek()]) {

                int previousDay = indexStack.pop();
                result[previousDay] = currentDay - previousDay;
            }

            indexStack.push(currentDay);
        }

        return result;
    }
}