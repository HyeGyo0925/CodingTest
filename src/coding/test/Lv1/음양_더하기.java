package coding.test.Lv1;

public class 음양_더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<absolutes.length; i++){
            if(signs[i] == false){
                answer-=absolutes[i];
            }else{
                answer+=absolutes[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        음양_더하기 aa = new 음양_더하기();
        System.out.println(aa.solution(new int[]{4,7,12}, new boolean[]{true,false,true}));
        System.out.println(aa.solution(new int[]{1,2,3}, new boolean[]{false,false,true}));
    }
}
