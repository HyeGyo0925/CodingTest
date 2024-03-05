package coding.test.Lv1;

public class 최대공약수와_최소공배수2 {

    public int[] solution(int n, int m){
        int[] answer = new int[2];
        int min=0, max=0;

        // 최대
        for(int i=1; i<=n*m; i++){
            if(n%i==0 && m%i==0){
                max = i;
            }
        }

        // 최소
        min = (n*m)/max;
        System.out.println(max + " " + min);
        return answer = new int[]{max, min};
    }

    public static void main(String[] args) {
        최대공약수와_최소공배수2 aa = new 최대공약수와_최소공배수2();
        System.out.println(aa.solution(3, 12));
        System.out.println(aa.solution(2, 5));
    }
}
