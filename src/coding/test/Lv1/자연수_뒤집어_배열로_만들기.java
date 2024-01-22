package coding.test.Lv1;

import java.util.Arrays;

public class 자연수_뒤집어_배열로_만들기 {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            answer[i] = (int) (n%10);
            n/=10;
        }
        return answer;
    }

    public static void main(String[] args) {
        자연수_뒤집어_배열로_만들기 aa = new 자연수_뒤집어_배열로_만들기();
        System.out.println(aa.solution(12345));
    }
}
