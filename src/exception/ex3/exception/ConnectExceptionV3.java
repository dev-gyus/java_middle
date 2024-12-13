package exception.ex3.exception;

import exception.ex2.NetworkClientExceptionV2;

public class ConnectExceptionV3 extends NetworkClientExceptionV3 {
    private final String address;
    public ConnectExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
