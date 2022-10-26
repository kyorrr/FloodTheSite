import java.util.*;

public class DotComBust {

    private final GameHelper helper = new GameHelper();
    private final ArrayList<SuperDotCom> superDotComList = new ArrayList<>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        SuperDotCom one = new SuperDotCom();
        one.setName("Pets.com");
        SuperDotCom two = new SuperDotCom();
        two.setName("eToys.com");
        SuperDotCom three = new SuperDotCom();
        three.setName("Go2.com");
        SuperDotCom four = new SuperDotCom();
        four.setName("Mihal");
        SuperDotCom five = new SuperDotCom();
        five.setName("Sanich");

        superDotComList.add(one);
        superDotComList.add(two);
        superDotComList.add(three);
        superDotComList.add(four);
        superDotComList.add(five);


        System.out.println("Ваша цель - потопить 5 'сайтов'.");
        System.out.println("Pets.com, eToys.com, Go2.com, Mihal, Sanich");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for(SuperDotCom superDotComToSet: superDotComList){

            ArrayList<String> newLocation = helper.placeSuperDotCom(5);

            superDotComToSet.setLocationCells(newLocation);
        }
    }
    private void startPlaying(){
        while (!superDotComList.isEmpty()){
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
            finishGame();
        }
    }
    private void checkUserGuess(String userGuess){
        numOfGuesses++;

        String result = "Мимо";

        for(SuperDotCom superDotComToTest: superDotComList){
            result = superDotComToTest.checkYourself(userGuess);

            if(result.equals("Попал")){
                break;
            }
            if(result.equals("Потопил")){
                superDotComList.remove(superDotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    private void finishGame(){
        if(numOfGuesses == 2){
            System.out.println("Это заняло у вас довольно много времени. " + numOfGuesses + " попыток");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}