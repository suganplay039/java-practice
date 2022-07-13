import java.util.ArrayList;
import java.util.Scanner;

public class RotationGameNew {
    public static void printArray(ArrayList<Integer> array) {
        for (Integer integer : array) {
            System.out.print(integer + " ");
        }
    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        /* String readLine1 = sc.nextLine();
        List<String> readLine1Array = List.of(readLine1.split(" "));
        System.out.println(readLine1Array);
        int aLength = Integer.parseInt(readLine1Array.get(0));
        List<String> aArray = new ArrayList<>(aLength);
        aArray = readLine1Array.subList(1, readLine1Array.size() + 1); */
        int aLength = sc.nextInt(); ArrayList<Integer> aArray = new ArrayList<>(aLength);
        for(int i = 0; i < aLength; i++) { aArray.add(sc.nextInt()); }
        int B = sc.nextInt();
        // if(aLength == B) {
        //     printArray(aArray);
        // } else {
        //     for(int i = 0; i < aLength; i++) {}
        // }
        for(int i = 0; i < B; i++) {
            // int last = Integer.parseInt(aArray.get(aLength - 1));
            int last = aArray.get(aLength - 1);
            for (int j = aLength - 1; j > 0; j--) {
                aArray.set(j, aArray.get(j - 1));
            }
            // aArray.set(0, String.valueOf(last));
            aArray.set(0, last);
        }
        printArray(aArray);
    }
}
