package bai_11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu;

public class Test {
    public static void main(String[] args) {
        Integer[] integer = new Integer[5];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        integer[3] = 4;
        integer[4] = 5;
        System.out.println("Mang ban dau la: ");
        for (Integer value : integer) {
            System.out.println(value);
        }
        ReverseArray<Integer> stack = new ReverseArray<>();
        stack.reverseArray(integer);
        System.out.println("Mang sau khi dao nguoc la: ");
        for (Integer value : integer) {
            System.out.println(value);
        }
    }
}
