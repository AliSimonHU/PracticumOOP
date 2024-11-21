// - naam: String
// - won: int
// - tie: int
// - lost: int
//////////////////////////////////////
// + Voetbalclub(naam: String)
// + processResult(ch: char): void
// + aantalGespeeld(): int
// + aantalPunten(): int
// + getNaam(): String
// + toString(): String

public class Voetbalclub {
    private String naam;
    private int won;
    private int tie;
    private int lost;

    public Voetbalclub(String naam) {
        this.naam = naam.trim();
        this.won = 0;
        this.tie = 0;
        this.lost = 0;
    }

    public void processResult(char ch) {
        if (ch == 'w') {
            won++;
        } else if (ch == 'g') {
            tie++;
        } else if (ch == 'v') {
            lost++;
        }
    }

    public int amountPlayed() {
        return won + tie + lost;
    }

    public int amountPoints() {
        return (won * 3) + tie;
    }

    public String getName() {
        return naam;
    }

    @Override
    public String toString() {
        return String.format("%-12s %2d %2d %2d %2d %2d",
                naam,
                amountPlayed(),
                won,
                tie,
                lost,
                amountPoints()
        );
    }
}
