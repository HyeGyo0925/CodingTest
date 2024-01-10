package coding.test.Lv0;
// 이어 붙인 수

public class 이어_붙인_수 {
    public int solution(int[] num_list) {
        int answer = 0;
        String even="", odd="";
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0){
                even += Integer.toString(num_list[i]);
            }else {
                odd += Integer.toString(num_list[i]);
            }
        }

        return answer = Integer.parseInt(even)+Integer.parseInt(odd);
    }

    public static void main(String[] args) {
        이어_붙인_수 aa = new 이어_붙인_수();
        System.out.println(aa.solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(aa.solution(new int[]{5, 7, 8, 3}));
    }
}
