package coding.test.Lv1;

public class 약수의_합 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer+=i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        약수의_합 aa = new 약수의_합();
        System.out.println(aa.solution(12));
    }
}
