import java.util.ArrayList;

public class DotComTestDrive {
    public static void main(String[] args) {

        DotCom dot = new DotCom();

        ArrayList<String> locations = new ArrayList<>();
        locations.add("2");
        locations.add("3");
        locations.add("4");
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

        System.out.println(result);
    }
}
