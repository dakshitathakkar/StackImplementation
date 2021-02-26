import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;
import java.util.Stack;

class StackDemo{
    public static void main(String[] args) {
        /*Stack<Integer> stack = new Stack<>();
        stack.push(45);

         */
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            stack.push((new Random().nextInt()%100));    //numbers from -99 to 99
        }
        System.out.println(stack.peek());
        Integer pop = stack.pop();
        System.out.println("pop = " + pop);
        System.out.println(stack.peek());

        System.out.println(stack);
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");  //remaining 9 elements are deleted
        }
       // System.out.println(stack);
    }
}