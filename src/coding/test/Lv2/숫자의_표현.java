package coding.test.Lv2;

public class 숫자의_표현 {
    public int solution(int n) {
        int answer = 0;

        for(int j=1; j<=n; j++) {
            int sum = 0;
            for (int i = j; i <= n; i++) {
                sum += i;
                if (sum == n) {
                    answer+=1;
                } else if (sum>n) {
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        숫자의_표현 aa = new 숫자의_표현();
        System.out.println(aa.solution(15));
        System.out.println(aa.solution(5));
    }
}
