package coding.test.Lv0;
// 조건 문자열

public class 조건_문자열 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals(">") && eq.equals("=")){
            if(n >= m){
                answer = 1;
            }else answer = 0;
        } else if (ineq.equals(">") && eq.equals("!")) {
            if(n > m){
                answer = 1;
            }else answer = 0;
        } else if (ineq.equals("<") && eq.equals("=")) {
            if(n <= m){
                answer = 1;
            }else answer = 0;
        } else if (ineq.equals("<") && eq.equals("!")) {
            if(n < m){
                answer = 1;
            }else answer = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        조건_문자열 aa = new 조건_문자열();

        System.out.println(aa.solution("<", "=", 20, 50));
        System.out.println(aa.solution(">", "!", 41, 78));
    }
}
