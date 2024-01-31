package coding.test.Lv1;

public class 삼총사 {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0; i<number.length; i++){

            for(int j=i+1; j<number.length; j++){

                for(int a = j+1; a<number.length; a++){
                    if(number[a] + number[j] + number[i] == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        삼총사 aa = new 삼총사();
        System.out.println(aa.solution(new int[]{-2, 3, 0, 2, -5}));
        System.out.println(aa.solution(new int[]{-3, -2, -1, 0, 1, 2, 3}));
        System.out.println(aa.solution(new int[]{-1, 1, -1, 1}));
    }
}
