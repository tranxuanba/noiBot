public class SelectionSort {
    static double[] lish = {2,4,2.4,6.7,7,1.5};
    public static void selectionSort(double[] lish){
        for (int i = 0; i < lish.length - 1; i++) {
            double min = lish[i];
            int index = i;
            for (int j = i + 1; j < lish.length; j++) {
                if (min > lish[j]){
                    min = lish[j];
                    index = j;
                }
            }
            if (index != i) {
                lish[index] = lish[i];
                lish[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(lish);
        for (double x:
             lish) {
            System.out.println(x);
        }
    }
}
