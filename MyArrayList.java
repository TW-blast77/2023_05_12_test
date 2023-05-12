import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {
    public static void main(String[] args) {
        SecureRandom myRandom = new SecureRandom();
        ArrayList<Integer> ArrList1 = new ArrayList<Integer>();
        ArrayList<Integer> ArrList2 = new ArrayList<Integer>();

        for(int i=0; i < 10 ; i++){
            ArrList1.add(myRandom.nextInt(10));
            ArrList2.add(myRandom.nextInt(10));
        }

        for(Integer i : ArrList1)
            System.out.print(i + " ");
        System.out.println("\n===============\n");
        for(Integer i : ArrList2)
            System.out.print(i + " ");
        ArrList1.addAll(ArrList2);
        System.out.println("\n===============\n");
        for(Integer i : ArrList1)
            System.out.print(i + " ");
    }
}
