public class Player {
    private int rating;
    public static final int K = 32;

    public Player() {
        this.rating = 1200;
    }

    public Player(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getWinningProbability(Player opponent) {
        return 1.0/(1+Math.pow(10,(opponent.getRating()-this.rating)/400.0));
    }

    public void win(Player opponent) {
        double EA = getWinningProbability(opponent);
        double EB = 1 - EA;
        setRating((int)(this.rating + K*(1-EA)));
        opponent.setRating((int)(opponent.getRating() + K*(0-EB)));
    }

    public void lose(Player opponent) {
        double EA = getWinningProbability(opponent);
        double EB = 1 - EA;
        setRating((int)(this.rating + K*(0-EA)));
        opponent.setRating((int)(opponent.getRating() + K*(1-EB)));
    }

    public void draw(Player opponent) {
        double EA = getWinningProbability(opponent);
        double EB = 1 - EA;
        setRating((int)(this.rating + K*(0.5-EA)));
        opponent.setRating((int)(opponent.getRating() + K*(0.5-EB)));
    }
}
