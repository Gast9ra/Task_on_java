package Products;

public class LineMas {

    public static void main(String arg[]) {
        int[] mas = new int[]{12, 435, -20, -2000000000, 300000, 87465};
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
        System.out.println(" ");
        System.out.print("[");
        for (int i=st;i<=fn;i++){
            System.out.print(mas[i]+", ");

        }
        System.out.print("]");

    }

}
