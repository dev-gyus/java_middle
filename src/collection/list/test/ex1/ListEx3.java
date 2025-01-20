package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        List<Integer> inputList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            Integer input = Integer.valueOf(scanner.nextLine());
            if(input == 0) {
                break;
            }
            inputList.add(input);
        }
        System.out.println("합계: " + inputList.stream().mapToInt(Integer::intValue).sum());
        System.out.println("평균: " + inputList.stream().mapToInt(Integer::intValue).average().orElseGet(() -> 0.0d));
    }
}
