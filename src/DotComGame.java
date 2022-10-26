/*import java.util.ArrayList;

public class DotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelperOld helper = new GameHelperOld();
        DotCom theDotCom = new DotCom();
        int randomNum = (int) (Math.random() * 5);
        int [] locations = {randomNum, randomNum + 1, randomNum + 2};

        ArrayList<String> locations2 = new ArrayList<>();
        for(int i = 0; i < locations.length; i++){
            locations2.add(i, String.valueOf(locations[i]));
        }
        theDotCom.setLocationCells(locations2);

        boolean isAlive = true;

        while(isAlive == true){
            String guess = helper.getUserInput("Введите число: ");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            } else {
                System.out.println(result);
            }
        }
    }
}*/
