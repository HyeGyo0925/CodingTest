package coding.test.Lv1;

public class 가장_가까운_같은_글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] str = s.split("");
        answer[0] = -1;

        for(int i=1; i<s.length(); i++){
            answer[i] = -1;

            for(int j = i-1; j>=0; j--){
                if(str[j].equals(str[i])){
                    answer[i] = i-j;
                    break;
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        가장_가까운_같은_글자 aa = new 가장_가까운_같은_글자();
        System.out.println(aa.solution("banana"));
        System.out.println(aa.solution("footvar"));
    }
}
