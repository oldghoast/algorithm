/**
 * @ClassName StackTest
 * @Description TODO
 * @Author oldghoast
 * @date 11/19/21 9:50 AM
 * @Version 1.0
 */
public class Stack {

    public static void main(String[] args) {
        String str = "stack";
        char[] chr = str.toCharArray();
        java.util.Stack stack = new java.util.Stack();
        for(int i=0;i<chr.length;i++){
            stack.push(chr[i]);
        }
        for(int i=0;i<chr.length;i++){
            System.out.print(stack.pop());
        }
    }

}
