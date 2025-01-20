package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
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
        StringBuilder sb = new StringBuilder();
        for(Integer i : inputList) {
            sb.append(i).append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
