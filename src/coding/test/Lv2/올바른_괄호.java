package coding.test.Lv2;

import java.util.Stack;

public class 올바른_괄호 {
    boolean solution(String s) {
        int cnt1 = 0, cnt2 = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                cnt1++;
            } else if (s.charAt(i) == ')') {
                cnt2++;
            }
            if(cnt1 < cnt2){
                return false;
            }
        }

        if(cnt1 == cnt2){
            return true;
        }
         return false;
    }

    boolean solution1(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0 ;i<s.length(); i++){

            if(s.charAt(i) == '('){
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                if(stack.empty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        올바른_괄호 aa = new 올바른_괄호();
        System.out.println(aa.solution("()()"));
        System.out.println(aa.solution("(())()"));
        System.out.println(aa.solution(")()("));
        System.out.println(aa.solution("(()("));

        System.out.println(aa.solution1("()()"));
        System.out.println(aa.solution1("(())()"));
        System.out.println(aa.solution1(")()("));
        System.out.println(aa.solution1("(()("));

    }
}
