package coding.test.Lv0;
// 문자열의 앞의 n글자

public class 문자열의_앞의_n글자 {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(0, n);
        return answer;
    }

    public static void main(String[] args) {
        문자열의_앞의_n글자 aa = new 문자열의_앞의_n글자();
        System.out.println(aa.solution("ProgrammerS123", 11));
    }
}
