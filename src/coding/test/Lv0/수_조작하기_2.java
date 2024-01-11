package coding.test.Lv0;
// 수 조작하기 2

public class 수_조작하기_2 {
    public String solution(int[] numLog) {
        String answer = "";

        for(int i=0; i<numLog.length-1; i++){
            if(numLog[i+1] - numLog[i] == 1){
                answer += "w";
            } else if (numLog[i+1] - numLog[i] == -1){
                answer += "s";
            } else if (numLog[i+1] - numLog[i] == 10){
                answer += "d";
            } else if (numLog[i+1] - numLog[i] == -10){
                answer += "a";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        수_조작하기_2 aa = new 수_조작하기_2();
        System.out.println(aa.solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
    }
}
