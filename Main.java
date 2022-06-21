public class Main {
    public static void main(String[] args) {
        Player magnus = new Player(2864);
        Player hikaru = new Player(2750);
        Player anish = new Player(2761);

        magnus.win(hikaru);
        magnus.win(anish);
        anish.win(hikaru);
        hikaru.lose(magnus);
        magnus.draw(anish);
        magnus.draw(anish);
        anish.win(hikaru);
        hikaru.lose(magnus);
        magnus.win(anish);

        System.out.println(magnus.getRating());
        System.out.println(hikaru.getRating());
        System.out.println(anish.getRating());
    }
}
