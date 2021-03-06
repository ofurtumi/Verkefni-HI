/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-24-10 15:55
 * @ Lýsing: 	klasinn inniheldur tvö föll, deilanleg sem tekur inn heiltölufylki og spítir út streng með
 *              tölum úr fylkinu sem eru deilanlegar með deili, og main fall sem er notað til að prófa deilanleg fallið
 */

public class ListiDeilanleg {
    public static void main(String[] args) {
        int[] listi = {3,4,7,14};
        System.out.println(deilanleg(listi, 7, 0));
        System.out.println(deilanleg(listi, 2, 2));
        System.out.println(deilanleg(listi, 8, 0));
        System.out.println(deilanleg(listi, 1, 0));
        System.out.println(deilanleg(listi, 1, 1));
        System.out.println(deilanleg(listi, 1, 2));
        System.out.println(deilanleg(listi, 1, 3));
        System.out.println(deilanleg(listi, 1, 4));
        System.out.println(deilanleg(listi, 1, 5));
    }

    /**
     * tekur inn fylki og deili og skilar streng af tölum úr fylkinu sem eru deilanleg með deilinum
     * @param listi, heiltölulisti
     * @param deilir, heiltala
     * @param n, staðsetning fyrstu athugunar, ath að ef það er utan marka fyllkisins er kastað runtime exception
     * @return strengur með þeim tölum sem deilanlegar voru með deili
     */
    public static String deilanleg(int[] listi, int deilir, int n) {
        System.out.println("n:" + n);
        if (n < 0 || n > listi.length) throw new RuntimeException("Utan marka " + n);
        if (n==listi.length) return "";
        if (listi[n]%deilir==0) return listi[n] + " " + deilanleg(listi, deilir, n+1);
        return deilanleg(listi, deilir, n+1) + "";
    }
}
