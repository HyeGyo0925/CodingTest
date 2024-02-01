package coding.test.Lv1;

public class 푸드_파이트_대회 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            sb.append(String.valueOf(i).repeat(count));
        }

        String answer = sb + "0";
        answer += sb.reverse();

        return answer;
    }

    public static void main(String[] args) {
        푸드_파이트_대회 aa = new 푸드_파이트_대회();
        System.out.println(aa.solution(new int[]{1, 3, 4, 6}));
        System.out.println(aa.solution(new int[]{1, 7, 1, 2}));
    }
}
