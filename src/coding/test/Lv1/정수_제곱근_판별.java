package coding.test.Lv1;

public class 정수_제곱근_판별 {
    public long solution(long n) {
        long answer = 0;

        while(answer * answer < n){
            answer++;
        }

        if(answer * answer == n){
            answer++;
            answer *= answer;
        }else {
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        정수_제곱근_판별 aa = new 정수_제곱근_판별();
        System.out.println(aa.solution(121));
    }
}
