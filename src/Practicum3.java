public class Practicum3 {
    public static void main(String[] args) {
        Voetbalclub ajx = new Voetbalclub("Ajax      ");
        Voetbalclub feij = new Voetbalclub("Feijenoord");

        feij.processResult('w');
        feij.processResult('w');
        feij.processResult('w');
        feij.processResult('g');

        System.out.println("Feijenoord punten: " + feij.amountPoints());
        System.out.println("Ajax gespeeld: " + ajx.amountPlayed());
        System.out.println();

        System.out.println(ajx);
        System.out.println(feij);
    }
}
