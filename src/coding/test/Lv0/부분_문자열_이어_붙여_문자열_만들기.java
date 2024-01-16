package coding.test.Lv0;
// 부분 문자열 이어 붙여 문자열 만들기

public class 부분_문자열_이어_붙여_문자열_만들기 {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for(int i=0; i<my_strings.length; i++){
            int start = parts[i][0];
            int end = parts[i][1];
            String ss = my_strings[i].substring(start, end+1);
            answer += ss;
        }

        return answer;
    }

    public static void main(String[] args) {
        부분_문자열_이어_붙여_문자열_만들기 aa = new 부분_문자열_이어_붙여_문자열_만들기();
        System.out.println(aa.solution(new String[] {"progressive", "hamburger", "hammer", "ahocorasick"}
                                                    , new int[][]{{0,4}, {1,2}, {3,5}, {7,7}}));
    }
}
