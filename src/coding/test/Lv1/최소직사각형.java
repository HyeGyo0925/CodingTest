package coding.test.Lv1;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;

        for(int i=0; i<sizes.length; i++){
            for(int j=0; j<sizes[i].length-1; j++){
                if(sizes[i][j] < sizes[i][j+1]){
                    int tmp = sizes[i][j];
                    sizes[i][j] = sizes[i][j+1];
                    sizes[i][j+1] = tmp;
                }
            }
        }

        int maxWidth = 0;
        for(int i=0; i<sizes.length; i++){
            if(maxWidth < sizes[i][0]){
                maxWidth = sizes[i][0];
            }
        }

        int maxHeight = 0;
        for(int i=0; i<sizes.length; i++){
            if(maxHeight < sizes[i][1]){
                maxHeight = sizes[i][1];
            }
        }

        return answer = maxWidth * maxHeight;
    }

    public static void main(String[] args) {
        최소직사각형 aa = new 최소직사각형();
        System.out.println(aa.solution(new int[][]{{60, 50}, {30,70}, {60,30}, {80,40}}));
        System.out.println(aa.solution(new int[][]{{10,7}, {12,3}, {8,15}, {14,7}, {5,15}}));
    }
}
