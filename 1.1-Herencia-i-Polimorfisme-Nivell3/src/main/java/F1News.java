import java.util.List;
import java.util.Scanner;

public class F1News extends News implements SportsNews{

    private String author;
    private List<F1News> f1NewsList;
    private String team;

    public F1News(String headline, String mainBody, NewsWriter author) {
        super(headline, mainBody, author);
        otherData();
    }

    public void addToNewsList(F1News f1News) {

        f1NewsList.add(f1News);

    }

    public void otherData(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Which team?");
        this.team = sc.nextLine();

    }

    @Override
    public int calculateNewsPrice() {

        int initialPrice = 100;
        int teamExtraPrice = 0;

        if (this.team.equals("Ferrari") || this.team.equals("Mercedes")) {
            teamExtraPrice = 50;
        }

        return initialPrice + teamExtraPrice;
    }

    @Override
    public int calculateNewsScore() {

        int initialScore = 4;
        int teamExtraScore = 0;

        if (this.team.equals("Ferrari") || this.team.equals("Mercedes")) {
            teamExtraScore = 2;
        }
        return initialScore + teamExtraScore;
    }
}