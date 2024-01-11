package coding.test.Lv0;

import java.util.Arrays;

public class 수열과_구간_쿼리_2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        Arrays.fill(answer, -1);

        for(int i=0; i< queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            int key = queries[i][2];

            int minValue = Integer.MAX_VALUE;

            for(int j=start; j<=end; j++){
                if(arr[j] > key && arr[j] < minValue){
                    minValue = arr[j];
                }
            }
            if(minValue != Integer.MAX_VALUE){
                answer[i] = minValue;
            }


        }

        return answer;
    }

    public static void main(String[] args) {
        수열과_구간_쿼리_2 aa = new 수열과_구간_쿼리_2();
        System.out.println(aa.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0,4,2}, {0,3,2}, {0,2,2}}));
    }
}
