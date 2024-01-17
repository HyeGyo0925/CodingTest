package coding.test.Lv0;
//세로 읽기

public class 세로_읽기 {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[][] test = new String[my_string.length()/m][m];
        int i = 0;
            for(int a=0; a<my_string.length()/m; a++){
                for(int b=0; b<m; b++){
                    test[a][b] = String.valueOf(my_string.charAt(i));
                    i++;
                }
            }

        for(int a=0; a<my_string.length()/m; a++){
            answer += test[a][c-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        세로_읽기 aa = new 세로_읽기();
        System.out.println(aa.solution("ihrhbakrfpndopljhygc", 4, 2));
        System.out.println(aa.solution("programmers", 1, 1));
    }
}
