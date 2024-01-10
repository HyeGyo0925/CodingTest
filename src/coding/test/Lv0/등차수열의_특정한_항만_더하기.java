package coding.test.Lv0;
// 등차수열의_특정한_항만_더하기

public class 등차수열의_특정한_항만_더하기 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] test = new int[included.length];
        for(int i=0; i<included.length; i++){
            test[i] = a;
            a+=d;
        }
        for(int i=0; i<included.length; i++){
            if(included[i] == true){
                answer += test[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
         등차수열의_특정한_항만_더하기 aa = new 등차수열의_특정한_항만_더하기();
        System.out.println(aa.solution(3,4, new boolean[]{true, false, false, true, true}));
        System.out.println(aa.solution(7,1, new boolean[]{false, false, false, true, false, false, false}));
    }
}
