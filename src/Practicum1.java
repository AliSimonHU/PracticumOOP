public class Practicum1 {
    public static void main(String[] args) {

        //Opdracht 1
        System.out.println("\n\rOpdracht 1");
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        //Opdracht 2
        System.out.println("\n\rOpdracht 2");
        int b = 1;
        while (b <= 10) {
            System.out.println(b);
            b++;
        }

        //Opdracht 3
        System.out.println("\n\rOpdracht 3");
        double max = 1.0;
        double min = 0.0;
        double range = max - min + 0.1;
        if (range == 1.1)
            range = range - 0.1;
        for (int c = 0; c < 10; c++) {
            double rand = (Math.random() * range) + min;
            String result = String.format("%.1f", rand);
            System.out.println(result);
        }

        //Opdracht 4
        System.out.println("\n\rOpdracht 4");
        int totaal = 0;
        for (int i = 0; i <= 39; i++) {
            totaal += i;
        }
        System.out.println(totaal);


        //Opdracht 5
        System.out.println("\n\rOpdracht 5");
        String patroon = "s";
        for (int i = 1; i <= 4; i++) {
            System.out.println(patroon);

            if (i == 2) {
                patroon = "s";
            } else {
                patroon += "s";
            }
        }
    }
}
