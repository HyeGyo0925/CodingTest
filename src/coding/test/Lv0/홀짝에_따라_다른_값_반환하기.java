package coding.test.Lv0;
// 홀짝에 따라 다른 값 반환하기


public class 홀짝에_따라_다른_값_반환하기 {
    public int solution(int n) {
        int answer = 0;
        if(n%2==0){
            // 짝수
            while(n>0){
                answer += (n*n);
                n-=2;
            }
        }else{
            // 홀수
            while(n > 0){
                answer += n;
                n-=2;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        홀짝에_따라_다른_값_반환하기 aa = new 홀짝에_따라_다른_값_반환하기();
        System.out.println(aa.solution(10));
    }
}
