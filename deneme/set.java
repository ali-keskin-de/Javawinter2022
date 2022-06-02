package deneme;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Integer arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};

        System.out.println(Arrays.toString(arr = tekrarsizlariEKle(arr)));


    }

    private static Integer[] tekrarsizlariEKle(Integer[] arr) {

        Set<Integer> setTekrarsiz= new HashSet<>();

        for (Integer each: arr
             ) {
            setTekrarsiz.add(each);

        }
        System.out.println(setTekrarsiz);
        return arr;

    }
}
