package coding.test.Lv1;

public class 자릿수_더하기 {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        for(int i=0; i<s.length(); i++){
            answer += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return answer;
    }

    public static void main(String[] args) {
        자릿수_더하기 aa = new 자릿수_더하기();
        System.out.println(aa.solution(123));
    }
}
