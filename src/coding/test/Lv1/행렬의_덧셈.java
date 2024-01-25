package coding.test.Lv1;

public class 행렬의_덧셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        행렬의_덧셈 aa = new 행렬의_덧셈();
        //System.out.println(aa.solution(new int[][]{{1,2}, {2,3}}, new int[][]{{3,4},{5,6}} ));
        System.out.println(aa.solution(new int[][]{{1}, {2}}, new int[][]{{3},{4}} ));
    }
}
