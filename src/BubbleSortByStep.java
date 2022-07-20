import java.util.Scanner;

public class BubbleSortByStep {

    public static void bubbleSortByStep(int[] lish) {
        boolean needNextPass = true;
        for (int i = 1; i < lish.length; i++) {
            needNextPass = false;
            for (int j = 0; j < lish.length - i; j++) {
                if (lish[j] > lish[j + 1]){
                    System.out.println("doi cho" + lish[j] + "cho " + lish[j + 1]);
                    int temp = lish[j];
                    lish[j] = lish[j + 1];
                    lish[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
        System.out.println("mang sau khi duoc sap xep la:");
        for (int x:
            lish) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chieu dai mang");
        int size = sc.nextInt();
        int[] lish = new int[size];
        for (int i = 0; i < lish.length; i++) {
            System.out.println("nhap vao phan tu thu" + (i + 1));
            lish[i] = sc.nextInt();
        }
        System.out.println("mang nhap vao la:");
        for (int x:
             lish) {
            System.out.println(x);
        }
        bubbleSortByStep(lish);
    }
}
