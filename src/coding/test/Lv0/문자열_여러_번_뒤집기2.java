package coding.test.Lv0;

public class 문자열_여러_번_뒤집기2 {
    public String solution(String my_string, int[][] queries) {
        char[] answer = my_string.toCharArray();

        for(int i=0; i< queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];

            for(int j=start; j<=end; j++){
                char c = answer[j];
                answer[j] = answer[end];
                answer[end] = c;
                end--;
            }
        }

        return new String(answer);
    }

    public static void main(String[] args) {
        문자열_여러_번_뒤집기2 aa = new 문자열_여러_번_뒤집기2();
        System.out.println(aa.solution("rermgorpsam", new int[][]{{2,3}, {0,7}, {5,9}, {6, 10}} ));
        System.out.println(aa.solution("apple", new int[][]{{1,3}, {0,1}}));
    }
}
