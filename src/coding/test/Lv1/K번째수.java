package coding.test.Lv1;

import java.util.Arrays;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int a=0; a<commands.length; a++){
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];
            int f = i;
            int[] lst = new int[j-i+1];

            for(int x=0; x<j-i+1; x++){
                lst[x] = array[f-1];
                f++;
            }

            Arrays.sort(lst);
            answer[a] = lst[k-1];
        }

        /*for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }*/

        return answer;
    }

    public static void main(String[] args) {
        K번째수 aa = new K번째수();
        System.out.println(aa.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2,5,3}, {4,4,1}, {1,7,3}}));
    }
}
