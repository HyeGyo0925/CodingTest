package coding.test.Lv2;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        answer = new int[2];
        int sum = brown + yellow;

        for(int i = 3; i <= sum; i++){
            int j = sum/i;

            if(sum % i ==0 && j>=3){
                int col = Math.max(i, j);
                int row = Math.min(i, j);
                int center = (col-2) * (row-2);

                if(center == yellow){
                    answer[0] = col;
                    answer[1] = row;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        카펫 aa = new 카펫();
        System.out.println(aa.solution(10 , 2));
        System.out.println(aa.solution(8, 1));
        System.out.println(aa.solution(24, 24));
    }
}
