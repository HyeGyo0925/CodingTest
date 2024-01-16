package coding.test.Lv0;

public class 문자열_여러_번_뒤집기 {
    public String solution(String my_string, int[][] queries) {
        char[] answer = my_string.toCharArray();

        for(int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];

            for(int j=start; j<=(start+end)/2; j++){
                char tmp = answer[j];
                answer[j] = answer[start+end-j];
                answer[start+end-j] = tmp;
            }
        }

        return new String(answer);
    }

    public static void main(String[] args) {
        문자열_여러_번_뒤집기 aa = new 문자열_여러_번_뒤집기();
        aa.solution("rermgorpsam", new int[][]{ {2,3}, {0,7}, {5,9}, {6,10}});
    }
}
