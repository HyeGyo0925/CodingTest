package coding.test.Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 짝지어_제거하기 {
    public int solution(String s) {
        int answer = -1;
        char[] cc = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<cc.length; i++){
            char chr = cc[i];

            if(stack.isEmpty()){
                stack.push(chr);
            }else {
                if(stack.peek() == chr){
                    stack.pop();
                }else{
                    stack.push(chr);
                }
            }
        }

        if(stack.isEmpty()){
            answer = 1;
        }else {
            answer = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        짝지어_제거하기 aa = new 짝지어_제거하기();
        System.out.println(aa.solution("baabaa"));
        System.out.println(aa.solution("cdcd"));
    }
}
