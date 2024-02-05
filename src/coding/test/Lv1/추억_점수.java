package coding.test.Lv1;

public class 추억_점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for(int i=0; i<photo.length; i++){
            int sum = 0;
            for(int j=0; j<photo[i].length; j++){
                for(int x=0; x<name.length; x++){
                    if(photo[i][j].equals(name[x])){
                        sum += yearning[x];
                    }
                }
            }
            answer[i] = sum;
        }
        return answer;
    }

    public static void main(String[] args) {
        추억_점수 aa = new 추억_점수();
        System.out.println(aa.solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3},
                new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}} ));
    }
}
