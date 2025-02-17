// push at bottom 

package Stack;

public class Ques1 {
    public static void pushAtBottom(stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int temp = s.pop();
        pushAtBottom(s, data);
        s.push(temp);
    }

    public static void main(String args[]) {
        stack<Integer> stack = new stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        pushAtBottom(stack, 4);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
