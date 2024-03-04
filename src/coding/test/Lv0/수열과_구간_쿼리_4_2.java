package coding.test.Lv0;

public class 수열과_구간_쿼리_4_2 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i=0; i<queries.length; i++){
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                if(j % queries[i][2] == 0){
                    arr[j]++;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        수열과_구간_쿼리_4_2 aa = new 수열과_구간_쿼리_4_2();
        System.out.println(aa.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0,4,1}, {0,3,2}, {0,3,3}}));
    }
}
