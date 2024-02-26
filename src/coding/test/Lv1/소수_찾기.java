package coding.test.Lv1;

public class 소수_찾기 {
    public int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++){
            if(isValue(i)){
                answer++;
            }
        }
        return answer;
    }

    public boolean isValue(int sum){
        for(int a=2; a <= (int) Math.sqrt(sum); a++){
            if(sum%a == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        소수_찾기 aa = new 소수_찾기();
        System.out.println(aa.solution(10));
        System.out.println(aa.solution(5));
    }
}
