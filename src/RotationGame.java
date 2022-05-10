import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aLength = sc.nextInt();
        ArrayList<Integer> aArray = new ArrayList<>(aLength);
        for (int i = 0; i < aLength; i++) { aArray.add(sc.nextInt()); }
        int B = sc.nextInt();
        /*System.out.println("aLength - " + aLength);
        System.out.println("aArray - " + aArray);
        System.out.println("B - " + B);
        System.out.println("ArrayList to String - " + aArray.subList());*/
        /*int rotate = aLength % B;
        if(rotate == 0) {
            System.out.println(aArray);
        } else {
            System.out.println("Need to rotate array - " + rotate);
        }*/
        /*List<Integer> newArray1 = aArray.subList(0, B);
        System.out.println(newArray1);
        List<Integer> newArray2 = aArray.subList(aLength - B, aLength);
        System.out.println(newArray2);
        newArray2.addAll(newArray1);
        System.out.println(newArray2);*/
        for(int i = 0; i < B; i++) {
            int last = aArray.get(aLength - 1);
            for (int j = aLength - 1; j > 0; j--) {
                aArray.set(j, aArray.get(j - 1));
            }
            aArray.set(0, last);
        }
        System.out.println(aArray);
    }
}
