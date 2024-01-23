package coding.test.Lv1;

public class 서울에서_김서방_찾기 {
    public String solution(String[] seoul) {
        String answer = "";
        int index = 0;
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                index = i;
                answer = "김서방은 "+index+"에 있다";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        서울에서_김서방_찾기 aa = new 서울에서_김서방_찾기();
        System.out.println(aa.solution(new String[]{"Jane", "Kim"}));
    }
}
