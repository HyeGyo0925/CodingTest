package coding.test.Lv0;
// 문자 리스트를 문자열로 변환하기

public class 문자_리스트를_문자열로_변환하기 {
    public static String solution(String[] arr) {
        String answer = "";
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] arr ={"a", "b", "c"};
        System.out.println(solution(arr));
    }

}
