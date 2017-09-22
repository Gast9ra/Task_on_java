package pack;

public class LineMas {

    public static void main(String arg[]) {
        int[] rew = new int[]{12, 435, -20, -2000000000, 300000, 87465};



    }



    public int[] maxInMas(int[] mas){
        int st = 0;
        int fn = 0;
        int sum = 0;
        int nowSum = 0;
        int st1 = 0;
        for (int i = 0; i < mas.length; i++) {
            nowSum += mas[i];
            if (nowSum > sum) {
                sum = nowSum;
                fn = i;
                st = st1;
            }
            if (nowSum < 0) {
                nowSum = 0;
                st1 = i + 1;
            }
        }
        return new int[]{st,fn};
    }



}
