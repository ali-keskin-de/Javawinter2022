package day22_arrays;

import java.util.Arrays;

public class C07_Split {

    public static void main(String[] args) {

        String str="java gün gectikce güzellesiyor";
        String kelimeler []= str.split(" ");

        System.out.println(Arrays.toString(kelimeler));// [java, gün, gectikce, güzellesiyor]
        System.out.println(kelimeler[1]);//gün

        String gectikce[]=str.split("gectikce");

        System.out.println(Arrays.toString(gectikce));// [java gün ,  güzellesiyor]

        String harf[]=str.split("");
        System.out.println(Arrays.toString(harf));
        //[j, a, v, a,  , g, ü, n,  , g, e, c, t, i, k, c, e,  , g, ü, z, e, l, l, e, s, i, y, o, r]

    }
}
