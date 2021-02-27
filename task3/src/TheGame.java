/**
 * Created by HOSHIBA on 02/10/2021.
 */
public class TheGame {
    private String name;
    private int score;

    public TheGame(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
