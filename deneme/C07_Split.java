package deneme;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {
        String str="java gün gectikce güzellesiyor";
        String kelime[]= str.split(" ");
        System.out.println(Arrays.toString(kelime));//[java, gün, gectikce, güzellesiyor]

        String harf[]=str.split("");
        System.out.println(Arrays.toString(harf));
        //[j, a, v, a,  , g, ü, n,  , g, e, c, t, i, k, c, e,  , g, ü, z, e, l, l, e, s, i, y, o, r]

        String gün[]= str.split("gün");
        System.out.println(Arrays.toString(gün));//[java ,  gectikce güzellesiyor]

    }

}
