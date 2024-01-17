package coding.test.Lv0;
// 문자열 뒤집기

public class 문자열_뒤집기 {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string.substring(s, e+1));
        answer.reverse();
        return my_string.substring(0, s) + answer + my_string.substring(e+1);
    }

    public static void main(String[] args) {
        문자열_뒤집기 aa = new 문자열_뒤집기();
        System.out.println(aa.solution("Progra21Sremm3", 6, 12));
        System.out.println(aa.solution("Stanley1yelnatS", 4, 10));
    }
}
