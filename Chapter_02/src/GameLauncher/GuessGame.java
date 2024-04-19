package GameLauncher;

public class GuessGame {

    Player p1;
    Player p2;
    Player p3;

    void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessP1 = p1.guess();
        int guessP2 = p2.guess();
        int guessP3 = p3.guess();

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNumber = (int)(Math.random()*10);
        System.out.println("Winning number is : " + targetNumber);

        if(guessP1 == targetNumber){
            p1IsRight = true;
        }
        if(guessP2 == targetNumber){
            p2IsRight = true;
        }
        if(guessP3 == targetNumber){
            p3IsRight = true;
        }
        if(p1IsRight || p2IsRight || p3IsRight){
            System.out.println("We have a winner!");

        } else{
            System.out.println("No winners this time");
        }
    }
}
