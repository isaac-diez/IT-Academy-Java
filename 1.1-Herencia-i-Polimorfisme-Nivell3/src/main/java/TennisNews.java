import java.util.List;
import java.util.Scanner;

public class TennisNews extends News implements SportsNews{

    private String author;
    private List<TennisNews> tennisNewsList;
    private String competition;
    private String player;

    public TennisNews(String headline, String mainBody, NewsWriter author) {
        super(headline, mainBody, author);
        otherData();
    }

    public void addToNewsList(TennisNews tennisNews) {

        tennisNewsList.add(tennisNews);

    }

    public void otherData(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Which competition?");
        this.competition = sc.nextLine();

        System.out.println("Which player played?");
        this.player = sc.nextLine();
    }

    @Override
    public int calculateNewsPrice() {

        int initialPrice = 150;
        int playerExtraPrice = 0;

        if (this.player.equals("Federer") || this.player.equals("Nadal") || this.player.equals("Djokovic")) {
            playerExtraPrice = 100;
        }
        return initialPrice + playerExtraPrice;
    }

    @Override
    public int calculateNewsScore() {

        int initialScore = 4;
        int playerExtraScore = 0;

        if (this.player.equals("Federer") || this.player.equals("Nadal") || this.player.equals("Djokovic")) {
            playerExtraScore = 3;
        }
        return initialScore + playerExtraScore;
    }
}