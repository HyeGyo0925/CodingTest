package coding.test.Lv1;

public class 콜라_문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(n >= a){
            answer += (n/a) * b;
            n = (n/a) * b + (n%a);
        }
        return answer;
    }

    public static void main(String[] args) {
        콜라_문제 aa = new 콜라_문제();
        //System.out.println(aa.solution(2, 1, 20));
        System.out.println(aa.solution(3, 1, 20));
    }
}
