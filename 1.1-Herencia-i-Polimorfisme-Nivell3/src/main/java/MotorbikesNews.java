import java.util.List;
import java.util.Scanner;

public class MotorbikesNews extends News implements SportsNews{

    private String author;
    private List<MotorbikesNews> motorbikesNewsList;
    private String team;

    public MotorbikesNews(String headline, String mainBody, NewsWriter author) {
        super(headline, mainBody, author);
        otherData();
    }

    public void addToNewsList(MotorbikesNews motorbikesNews) {

        motorbikesNewsList.add(motorbikesNews);

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

        if (this.team.equals("Honda") || this.team.equals("Yamaha")) {
            teamExtraPrice = 50;
        }

        return initialPrice + teamExtraPrice;
    }

    @Override
    public int calculateNewsScore() {

        int initialScore = 4;
        int teamExtraScore = 0;

        if (this.team.equals("Honda") || this.team.equals("Yamaha")) {
            teamExtraScore = 2;
        }
        return initialScore + teamExtraScore;
    }
}