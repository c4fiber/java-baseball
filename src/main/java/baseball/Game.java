package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import camp.nextstep.edu.missionutils.Randoms;

public class Game {
    static Scanner sc = new Scanner(System.in);

    public Game() {
        title();
    }
    private void title() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }
    public void play() {
        System.out.println("숫자를 입력해주세요 : ");

        List<Integer> computer = getComputerNumber();
        List<Integer> user = getUserNumber();

        // TODO compare computerNumber,userNumber

        // TODO print result (X strike, X ball)
    }
    public boolean end() {
        String input = sc.nextLine();
        if (input.charAt(0) == '1') {
            return false;
        } else if (input.charAt(0) == '2') {
            return true;
        }

        // Exception: 1 or 2 가 아닌 다른값이 들어옴 -> 종료

        return true;
    }

    private List<Integer> getComputerNumber() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        return computer;
    }

    private List<Integer> getUserNumber() {
        String input = sc.nextLine();

        // Exception 1. not Number
        for(char c : input.toCharArray()) {
            if (48 <= c && c <= 57) return null;
        }
        // Exception 2. not 3 Number
        if (input.length() != 3) return null;

        List<Integer> userNumbers = new ArrayList<>();
        for(char c : input.toCharArray()) {
            userNumbers.add((int) c);
        }

        return userNumbers;
    }
}
