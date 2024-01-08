package coding.test.Lv0;
//더 크게 합치기


public class 더_크게_합치기 {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int ba = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        return ab>ba ? ab:ba;
    }

    public static void main(String[] args) {
        더_크게_합치기 aa = new 더_크게_합치기();
        System.out.println(aa.solution(9, 91));
    }


}
