package coding.test.Lv2;

public class N개의_최소공배수 {
    public int solution(int[] arr) {
        int answer = 0;

        if(arr.length == 1) return arr[0];

        int g = gcd(arr[0], arr[1]);    //처음 두 수의 최대공약수
        answer = (arr[0] * arr[1])/g;   //처음 두 수의 최소공배수

        if(arr.length > 2){
            for(int i=2; i<arr.length; i++){
                g = gcd(answer, arr[i]);
                answer = (answer * arr[i])/g;
            }
        }

        return answer;
    }

    // 최대 공약수
    public static int gcd(int a, int b){
        int r = a % b;
        if(r == 0) return b;
        else return gcd(b, r);
    }

    public static void main(String[] args) {
        N개의_최소공배수 aa = new N개의_최소공배수();
        System.out.println(aa.solution(new int[]{2,6,8,14}));
        System.out.println(aa.solution(new int[]{1,2,3}));
        System.out.println(aa.solution(new int[]{2, 7}));
    }
}
