package bai4_lop_va_doi_tuong.bai_tap.stopwatch;

public class StopWatch {
    public static int[] selectionSort(int... a) {
        int minIndex = 0;
        for (int i = 0; i < a.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    minIndex = j;
                }
                int tempt = a[minIndex];
                a[i] = a[minIndex];
                a[minIndex] = tempt;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[100000];
        for (int i = 0; i < 100000; i++){
            a[i] = (int) (Math.random() * 10000);
        }
        StopWatchClass stopWatch = new StopWatchClass();
        stopWatch.start();
        a = selectionSort(a);
        stopWatch.stop();
        System.out.print("Start time: " + stopWatch.getStartTime() + " and Stop time: " + stopWatch.getEndTime());
        System.out.print("Time run: " + stopWatch.getElapsedTime() + 's');
    }
}
