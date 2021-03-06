/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-08-11 22:19
 * @ Lýsing: 	Klasi sem vinnur með Nemandi klasanum og sér um einkunnarutanumhald
 */

public class Einkunn {
    private double maetingHlutfall ;
    private int lokaprof;

    public Einkunn(double m, int l) {
        if (erLoglegt(m)) maetingHlutfall = m;
        else maetingHlutfall = 0.0;
        lokaprof = l;
    }
    
    /**
     * athugar hvort mætingareinkunn sé "lögleg" þ.e. á milli 0.0 og 1.0
     * @param m double mætingareinkunn
     * @return true ef einkunn er lögleg annars false
     */
    private boolean erLoglegt(double m) {
        if (m > 0.0 && m <= 1.0) return true;
        return false;
    }
    
    public int getLokaprof() {
        return lokaprof;
    }
    
    public void setLokaprof(int l) {
        this.lokaprof = l;
    }
    
    /**
     * setur nýja mætingareinkunn ef nýja er lögleg
     * @param m double nýja mætingareinkunn
     */
    public void setMaetingHlutfall(double m) {
        if (erLoglegt(m)) this.maetingHlutfall = m;
    }
    
    public double getMaetingHlutfall() {
        return maetingHlutfall;
    }
    
    /**
     * athugar hvort lokaprófseinkunn sé yfir lágmarkseinkunn þ.e. 5
     * @return true ef yfir lágmarki, annars false
     */
    public boolean erLagmarkseinkunn() {
        if (lokaprof >= 5) return true;
        return false;
    }

    public String toString() {
        return "Einkunn{maetingHlutfall="+maetingHlutfall+", lokaprof="+lokaprof+"}";
    }

    public static void main(String[] args) {
        Einkunn e = new Einkunn(0.5, 6);
        System.out.println(e.getMaetingHlutfall());
        e.setLokaprof(3);
        System.out.println(e.getLokaprof());
        e.setMaetingHlutfall(2.0);
        System.out.println(e.getMaetingHlutfall());
        System.out.println("einkunn er fyrir ofan lágmarkseinkunn? " + e.erLagmarkseinkunn());

        Einkunn e2 = new Einkunn(-0.3, 10);
        System.out.println(e2.getMaetingHlutfall());
    }
}
