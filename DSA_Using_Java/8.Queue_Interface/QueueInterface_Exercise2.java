import java.util.*;

class Tester {

    public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {

        int min = Integer.MAX_VALUE;
        for (int num : inputStack) {
            if (num < min) {
                min = num;
            }
        }

        int count = 0;
        for (int num : inputStack) {
            if (num == min) {
                count++;
            }
        }

        Deque<Integer> temp = new ArrayDeque<>();

        for (int num : inputStack) {
            if (num != min) {
                temp.addLast(num);  // keeps order
            }
        }


        for (int i = 0; i < count; i++) {
            temp.addLast(min);
        }


        Deque<Integer> result = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>(temp);


        for (int i = list.size() - 1; i >= 0; i--) {
            result.push(list.get(i));
        }

        return result;
    }

    public static void main(String[] args) {

        Deque<Integer> inputStack = new ArrayDeque<>();
        inputStack.push(10);
        inputStack.push(8);
        inputStack.push(5);
        inputStack.push(12);
        inputStack.push(5);

        Deque<Integer> updatedStack = changeSmallest(inputStack);

        System.out.println("Stack After Modification:");
        for (Integer value : updatedStack)
            System.out.println(value);
    }
}