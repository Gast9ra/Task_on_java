package pack;

public class LineMas {

    public static void main(String arg[]) {
        int[] rew = new int[]{12, 435, -20, -2000000000, 300000, 87465};



    }



    public int[] maxInMas(int[] mas){
        int start = 0;
        int finish = 0;
        int sum = 0;
        int nowSum = 0;
        int cacheStart = 0;
        for (int i = 0; i < mas.length; i++) {
            nowSum += mas[i];
            if (nowSum > sum) {
                sum = nowSum;
                finish = i;
                start = cacheStart;
            }
            if (nowSum < 0) {
                nowSum = 0;
                cacheStart = i + 1;
            }
        }
        return new int[]{start,finish};
    }



}
