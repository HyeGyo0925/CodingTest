package coding.test.Lv0;
//수열과 구간 쿼리 3

import java.util.Arrays;

public class 수열과_구간_쿼리_3 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        int n = 0;
        for(int i=0; i<queries.length; i++){
            n = answer[queries[i][0]];
            answer[queries[i][0]] = answer[queries[i][1]];
            answer[queries[i][1]] = n;
        }
        return answer;
    }

    public static void main(String[] args) {
        수열과_구간_쿼리_3 aa = new 수열과_구간_쿼리_3();
        System.out.println(Arrays.toString(aa.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}})));
    }

}
