package enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("코드를 입력하세요(200, 400, 404, 500)");
        String inputStr = scanner.nextLine();
        int code = Integer.parseInt(inputStr);
        HttpStatus inputStatus = HttpStatus.findByCode(code);

        if (inputStatus != null) {
            System.out.println("code = " + inputStatus.getCode() + ", message = " + inputStatus.getMessage());
            System.out.println("is Success = " + inputStatus.isSuccess());
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}
