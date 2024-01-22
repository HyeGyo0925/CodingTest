package coding.test.Lv1;

import java.util.Arrays;

public class x만큼_간격이_있는_n개의_숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long plus = x;
        for(int i=0; i<n; i++){
            answer[i] = plus;
            plus+=x;
        }
        return answer;
    }

    public static void main(String[] args) {
        x만큼_간격이_있는_n개의_숫자 aa = new x만큼_간격이_있는_n개의_숫자();
        System.out.println(aa.solution(2, 5));
        System.out.println(aa.solution(-4, 2));
    }
}
