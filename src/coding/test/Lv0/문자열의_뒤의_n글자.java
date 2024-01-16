package coding.test.Lv0;
// 문자열의 뒤의 n글자

public class 문자열의_뒤의_n글자 {
    public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(my_string.length()-n);
        return answer;
    }

    public static void main(String[] args) {
        문자열의_뒤의_n글자 aa = new 문자열의_뒤의_n글자();
        System.out.println(aa.solution("ProgrammerS123", 11));
        System.out.println(aa.solution("He110W0r1d",5));
    }

}
