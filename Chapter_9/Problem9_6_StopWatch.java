// Problem 9.6
// StopWatch class and timing selection sort
// Chapter_9

import java.util.Random;

public class Problem9_6_StopWatch {
    public static class StopWatch {
        private long startTime;
        private long endTime;

        public StopWatch() {
            startTime = System.currentTimeMillis();
        }

        public long getStartTime() {
            return startTime;
        }

        public long getEndTime() {
            return endTime;
        }

        public void start() {
            startTime = System.currentTimeMillis();
        }

        public void stop() {
            endTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            return endTime - startTime;
        }
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[min])
                    min = j;
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }
    }

    public static void main(String[] args) {
        int n = 100000;
        int[] a = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++)
            a[i] = rnd.nextInt();
        StopWatch sw = new StopWatch();
        sw.start();
        selectionSort(a);
        sw.stop();
        System.out.println("Elapsed time (ms): " + sw.getElapsedTime());
    }
}