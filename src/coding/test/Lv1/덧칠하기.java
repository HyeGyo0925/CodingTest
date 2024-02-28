package coding.test.Lv1;

public class 덧칠하기 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int tmp = 0;

        for(int i=0; i< section.length; i++){
            if(section[i] < tmp){
                continue;
            }
            answer++;
            tmp = section[i] + m;
        }
        return answer;
    }

    public static void main(String[] args) {
        덧칠하기 aa = new 덧칠하기();
        System.out.println(aa.solution(8, 4, new int[]{2, 3, 6}));
    }
}
