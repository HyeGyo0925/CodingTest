package coding.test.Lv2;

public class 점프와_순간_이동 {
    public int solution(int n) {
        int ans = 0;
        while (n!=0){
            if(n % 2 == 0){
                n/=2;
            }else {
                n--;
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        점프와_순간_이동 aa = new 점프와_순간_이동();
        System.out.println(aa.solution(5));
        System.out.println(aa.solution(6));
        System.out.println(aa.solution(7));
        System.out.println(aa.solution(5000));
    }
}
