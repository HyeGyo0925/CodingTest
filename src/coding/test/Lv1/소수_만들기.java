package coding.test.Lv1;

public class 소수_만들기 {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int t=j+1; t<nums.length; t++){
                    sum = nums[i] + nums[j] + nums[t];

                    if (isValue(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public boolean isValue(int sum){
        for(int a=2; a<sum; a++){
            if(sum%a == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        소수_만들기 aa = new 소수_만들기();
        System.out.println(aa.solution(new int[]{1,2,3,4}));
        System.out.println(aa.solution(new int[]{1,2,7,6,4}));
    }
}
