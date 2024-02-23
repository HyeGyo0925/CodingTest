package coding.test.Lv1;

public class 기사단원의_무기 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] list = new int[number];

        for(int i=1; i<=number; i++){
            int cnt = 0;
            for(int j=1; j<=i; j++){
                if(i % j == 0){
                    cnt++;
                }

            }
            list[i-1]= cnt;
        }

        for(int i=0; i<number; i++){
            if(list[i] > limit){
                answer += power;
            }else {
                answer += list[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        기사단원의_무기 aa = new 기사단원의_무기();
        System.out.println(aa.solution(5,3,2));
        System.out.println(aa.solution(10,3,2));
    }
}
