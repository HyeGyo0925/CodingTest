package coding.test.Lv1;

import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0, cnt = 0, hap = 0;

        Arrays.sort(d);

        for(int i=0; i<d.length; i++){
            sum += d[i];
        }

        if(sum == budget){
            return  answer = d.length;
        } else if (sum < budget) {
            return  answer = d.length;
        }

        for(int i=0; i<d.length; i++){
            hap += d[i];
            if(hap>budget){
                return answer = cnt;
            }
            cnt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        예산 aa = new 예산();
        System.out.println(aa.solution(new int[]{1,3,2,5,4}, 9));
        System.out.println(aa.solution(new int[]{2,2,3,3}, 10));
        System.out.println(aa.solution(new int[]{1,1,1}, 4));
    }
}
