import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
    List<String> riddle;
    List<String> answer;
    Integer cows;
    Integer bulls;


    public void startGame() {
        riddle = getRiddle();
        boolean game = true;
        while (game) {
            answer = getAnswer();
            cows = getCows(riddle, answer);
            bulls = getBulls(riddle, answer);
            System.out.println();
            System.out.printf("You have %s cows, and %s bulls ", cows, bulls);
            System.out.println();
            if (bulls == 4) {
                game = false;
            }
        }

        System.out.println();
        System.out.printf("You have %s cows, and %s bulls", cows, bulls);
        System.out.println();
        System.out.printf("This is a riddle: %s, and this is your answer %s", riddle, answer);
        System.out.println();
    }

    private List<String> getRiddle() {
        double rnd = Math.random() * 1_000_000_000;
        List<String> rndList = Arrays.asList(Integer.toString((int) rnd).split(""));
        List<String> riddle = new ArrayList<>();
        boolean flag = true;
        int count = 0;

        while (flag) {
            if (!riddle.contains(rndList.get(count))) {
                riddle.add(rndList.get(count));
            }
            if (riddle.size() == 4) {
                flag = false;
            }
            count++;
        }

        return riddle;
    }

    private List<String> getAnswer() {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        List<String> answer = new ArrayList<>();
        while (flag) {
            System.out.println("Enter your answer(example: 4321) > ");
            String[] digits = input.next().split("");
            if (digits.length < 4 || digits.length > 4) {
                System.out.println("-----------------------------------------");
                System.out.println("!!!The length of your number must be 4!!!");
                System.out.println("-----------------------------------------");
            } else {
                answer = Arrays.asList(digits);
                flag = false;
            } 
        }
        return answer;
    }

    private int getCows(List<String> riddle, List<String> answer) {
        int cows = 0;

        for (String element : answer) {
            if (riddle.contains(element)) {
                cows++;
            }
        }

        return cows;
    }

    private int getBulls(List<String> riddle, List<String> answer) {
        int bulls = 0;

        for (int index = 0; index < riddle.size(); index++) {
            if (riddle.get(index).equals(answer.get(index))) {
                bulls++;
            }
        }

        return bulls;
    }

}
