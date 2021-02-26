import java.util.*;

/** A stack is a data structure in which an element is inserted into and removed from
 the same end, i.e., Last-In and First-Out
 @param <E> the element type
 */

interface StackInt<E>{

    /** Pushes the object on the top of the stack and returns the object pushed
     *
     * @param Item to be inserted
     * @return obj inserted
     */
    public abstract boolean push(E Item);

    /** returns the object at the top of the stack without removing it
     * @post the stack remains unchanged
     * @return the object at the top of the stack
     * @throws java.util.NoSuchElementException if the stack is empty
     */
    public abstract E peek();

    /** returns the object at the top of the stack and removes it
     * @post the stack is one item smaller
     * @return the object at the top of the stack
     * @throws java.util.NoSuchElementException if the stack is empty
     */
    public abstract E pop();

    /** returns true if the stack is empty, else returns false
     * @return true/false if stack is empty/not empty
     */
    public abstract boolean isEmpty();
}

/** Class Stack will implement the methods of interface StackInt
 * and acts as an adapter class
 */
class Stack<E> implements StackInt<E>{

    /** An arraylist to store data
     */
    private ArrayList<E> stack;

    /** Creating a stack using an arraylist to serve as a container
     */
    public Stack() {
        this.stack = new ArrayList<>();
    }

    /** Pushes data on to the top of the stack
     * @post Item is at the top of stack
     * @param Item to be inserted
     * @return Item inserted
     */
    @Override
    public boolean push(E Item) {
        return stack.add(Item);
    }

    /**Returns data at the top of the stack without deleting it
     *
     * @return Item at top
     * @throws NoSuchElementException if stack is empty
     */
    @Override
    public E peek() {
        if(stack.isEmpty()){
            throw new NoSuchElementException("Underflow");
        }
        return stack.get(stack.size()-1);
    }

    /** Returns data at the top of the stack and deletes it
     *
     * @return Item that is deleted
     * @throws NoSuchElementException if stack is empty
     */
    @Override
    public E pop() {
        if(stack.isEmpty()){
            throw new NoSuchElementException("Underflow");
        }
        return stack.remove(stack.size()-1);
    }

    /** Checks if the stack is empty or not
     *
     * @return true if stack is empty, else returns false
     */
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int count(){
        return stack.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Math.abs(new Random().nextInt() % 100));
        }
        System.out.println(list);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(list.get(i));
            System.out.print(stack.peek()+" ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(stack.pop()+" ");
        }
    }
}

































