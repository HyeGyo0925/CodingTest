package coding.test.Lv0;
// 마지막 두 원소

public class 마지막_두_원소 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];

        int one = num_list[num_list.length-1];
        int two = num_list[num_list.length-2];

        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }

        if(one>two){
            answer[num_list.length] = one-two;
        }else {
            answer[num_list.length] = one * 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        마지막_두_원소 aa = new 마지막_두_원소();
        System.out.println(aa.solution(new int[] {2, 1, 6}));
    }
}
