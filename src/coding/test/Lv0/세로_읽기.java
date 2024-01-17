package coding.test.Lv0;
//세로 읽기

public class 세로_읽기 {
    public String solution(String my_string, int m, int c) {
        String answer = "";

        for(int i = c-1; i<my_string.length(); i+=m){
            answer += my_string.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        세로_읽기 aa = new 세로_읽기();
        System.out.println(aa.solution("ihrhbakrfpndopljhygc", 4, 2));
        System.out.println(aa.solution("programmers", 1, 1));
    }
}
