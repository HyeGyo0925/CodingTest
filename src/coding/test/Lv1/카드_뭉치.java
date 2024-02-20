package coding.test.Lv1;

public class 카드_뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int card1Idx = 0;
        int card2Idx = 0;

        for(int i=0; i<goal.length; i++){
            String target = goal[i];

            if(card1Idx < cards1.length && target.equals(cards1[card1Idx])){
                card1Idx++;
            } else if (card2Idx < cards2.length && target.equals(cards2[card2Idx])) {
                card2Idx++;
            }else {
                return answer = "No";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        카드_뭉치 aa = new 카드_뭉치();
        System.out.println(aa.solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
        System.out.println(aa.solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }
}
