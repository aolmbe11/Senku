
package senku;


public class Main {

    static Senku senku = new Senku();
    
    public static void main(String[] args) {
        senku.crearPatron();
        System.out.println(senku.pintarTablero());
    }
    
}
