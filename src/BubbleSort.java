public class BubbleSort {
    static int[] lish = {2,3,4,12,4,5,56,3,23,3,5};

    public static void bubbleSort(int[] lish) {
        boolean needNextPass = true;
        for (int i = 1; i < lish.length && needNextPass; i++) {
            //xet kha nang mang duoc sap xep roi hay chua
            needNextPass = false;
            for (int j = 0; j < lish.length - i; j++) {
                if (lish[j] > lish[j + 1]){
                    int temp = lish[j];
                    lish[j] = lish[j +1];
                    lish[j + 1] = temp;

                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(lish);
        System.out.println("mang sau khi sap xep: ");
        for (int x:
             lish) {
            System.out.println(x);
        }
    }
}
