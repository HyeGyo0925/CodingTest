package coding.test.Lv1;

public class 약수의_개수와_덧셈 {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i=left; i<=right; i++){     // i = 13,14,15,16,17
            int cnt = 0;
            for(int a=1; a<=i; a++){        // a = 1부터 i
                if(i%a == 0){
                    cnt++;
                }
            }
            if(cnt % 2 == 0){
                answer += i;
            }else {
                answer -= i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        약수의_개수와_덧셈 aa = new 약수의_개수와_덧셈();
        System.out.println(aa.solution(13, 17));
        System.out.println(aa.solution(24, 27));
    }
}
