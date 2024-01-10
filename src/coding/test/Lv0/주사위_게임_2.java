package coding.test.Lv0;
// 주사위 게임 2

public class 주사위_게임_2 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a != b && a!= c && b!=c){
            answer = a+b+c;
        } else if (a == b && b==c && c==a) {
            answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        } else if (a == b || b == c || c==a) {
            answer = (a+b+c)*(a*a+b*b+c*c);
        }
        return answer;
    }

    public static void main(String[] args) {
        주사위_게임_2 aa = new 주사위_게임_2();
        System.out.println(aa.solution(2,6,1));
        System.out.println(aa.solution(5,3,3));
        System.out.println(aa.solution(4,4,4));
    }
}
