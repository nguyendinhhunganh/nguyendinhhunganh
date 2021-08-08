package bai_11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu;
import java.util.Stack;
public class ReverseArray<T> {
    public ReverseArray(){
    }
    public void reverseArray(T[] elements) {
        Stack<T> stack = new Stack<>();
        for (T element : elements) {
            stack.push(element);
        }
        for (int i = 0; i < elements.length; i++) {
            elements[i] = stack.pop();
        }
    }
}
