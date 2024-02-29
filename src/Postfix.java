import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        Stack<Long> stack = new Stack<>();

        String s = new Scanner(System.in).next();
        long n;
        long m;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                stack.push(Long.parseLong(String.valueOf(s.charAt(i))));
            } else if (s.charAt(i)=='+') {
                n  = stack.peek();
                stack.pop();
                m = stack.peek();
                stack.pop();
                stack.push(n+m);
            }
            else if(s.charAt(i)=='-'){
                n  =stack.peek();
                stack.pop();
                m= stack.peek();
                stack.pop();
                stack.push(m-n);
            }
            else if (s.charAt(i)=='*'){
                n  =stack.peek();
                stack.pop();
                m= stack.peek();
                stack.pop();
                stack.push(n*m);
            }
            else {
                n  =stack.peek();
                stack.pop();
                m= stack.peek();
                stack.pop();
                stack.push(n/m);
            }
        }
        System.out.println(stack.peek());
    }
}
