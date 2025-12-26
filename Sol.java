import java.util.*;

public class Sol{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int N = sc.nextInt();
        int[] arr = new int[N];

        // Read array elements
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Find maximum element
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Frequency array
        int[] flags = new int[max + 1];
        for (int j = 0; j <= max; j++) {
            flags[j] = 0;
        }

        for (int j = 0; j < N; j++) {
            flags[arr[j]]++;
        }

        // Find missing elements
        int missedCount = 0;
        int[] missedEles = new int[max];

        for (int j = 1; j <= max; j++) {
            if (flags[j] == 0) {
                missedEles[missedCount] = j;
                missedCount++;
            }
        }

        // Print results
        if (missedCount == 0) {
            System.out.println("No Missed Elements");
        } else {
            for (int k = 0; k < missedCount; k++) {
                System.out.println(missedEles[k]);
            }
        }
    }
}
