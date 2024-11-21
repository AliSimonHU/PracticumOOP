public class Practicum2 {
    public static void main(String[] args) {
        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
        System.out.println("BREEDTE: " + z1.getWidth());
        System.out.println("LENGTE: " + z1.getLength());
        System.out.println("DIEPTE: " + z1.getDepth());
        System.out.println("BEREKENDE INHOUD: " + z1.content());
        System.out.println();

        Zwembad z2 = new Zwembad( );
        z2.setWidth(2.5);
        z2.setLength(100.0);
        z2.setDepth(2.0);
        double inh = z2.content();
        System.out.println("GEGEVENS ZWEMBAD: "+z2.toString());
        System.out.println("BEREKENDE INHOUD: " + z2.content());
    }
}
