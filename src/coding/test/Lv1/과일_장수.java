package coding.test.Lv1;

import java.util.Arrays;

public class 과일_장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += m * score[i - m];
        }

        return answer;
    }

    public static void main(String[] args) {
        과일_장수 aa = new 과일_장수();
        System.out.println(aa.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
        System.out.println(aa.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}
