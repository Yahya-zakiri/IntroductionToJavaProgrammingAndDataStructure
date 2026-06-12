//Chapter 7
//Programming exercises
//(Game: locker puzzle)

public class LockerPuzzle {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[101]; // 1..100
        for (int s = 1; s <= 100; s++) {
            for (int k = s; k <= 100; k += s)
                lockers[k] = !lockers[k];
        }
        System.out.print("Open lockers: ");
        for (int i = 1; i <= 100; i++)
            if (lockers[i])
                System.out.print(i + " ");
        System.out.println();
    }
}