package coding.test.Lv1;

public class 기사단원의_무기 {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i=1; i<=number; i++){
            int cnt = 0;
            for(int j=1;j*j<=i;j++){
                if(j*j==i) cnt++;
                else if(i%j==0) cnt+=2;
            }

            if(cnt>limit) cnt = power;
            answer += cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        기사단원의_무기 aa = new 기사단원의_무기();
        System.out.println(aa.solution(5,3,2));
        System.out.println(aa.solution(10,3,2));
    }
}
