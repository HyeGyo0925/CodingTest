package coding.test.Lv1;

public class 짝수와_홀수 {
    public String solution(int num) {
        String answer = (num%2)==0?"Even":"Odd";
        return answer;
    }

    public static void main(String[] args) {
        짝수와_홀수 aa = new 짝수와_홀수();
        System.out.println(aa.solution(5));
    }
}
