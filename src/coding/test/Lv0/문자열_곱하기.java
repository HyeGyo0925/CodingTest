package coding.test.Lv0;
// 문자열 곱하기

public class 문자열_곱하기 {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i =0; i<k; i++){
            answer +=my_string;
        }
        return answer;
    }

    public static void main(String[] args) {
        문자열_곱하기 ss = new 문자열_곱하기();
        System.out.println( ss.solution("string", 3) );
    }

}
