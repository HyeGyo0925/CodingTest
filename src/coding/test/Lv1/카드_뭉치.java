package coding.test.Lv1;

public class 카드_뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int card1Index = 0;
        int card2Index = 0;

        for(int i=0; i< goal.length; i++){
            if(card1Index < cards1.length && goal[i].equals(cards1[card1Index])) {
                card1Index++;
                continue;
            }

            if(card2Index < cards2.length && goal[i].equals(cards2[card2Index])) {
                card2Index++;
                continue;
            }
            answer = "No";
        }

        return answer;
    }

    public static void main(String[] args) {
        카드_뭉치 aa = new 카드_뭉치();
        System.out.println(aa.solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }
}
