package coding.test.Lv1;

public class 문자열을_정수로_바꾸기 {
    public int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        문자열을_정수로_바꾸기 aa = new 문자열을_정수로_바꾸기();
        System.out.println(aa.solution("-1234"));
        System.out.println(aa.solution("1234"));
    }
}
