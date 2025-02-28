package collection.deque.test.stack;

public class BrowserHistoryTest {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        browserHistory.visitPage("youtube.com");
        browserHistory.visitPage("google.com");
        browserHistory.visitPage("facebook.com");

        browserHistory.goBack();
        System.out.println(browserHistory.getCurrentPage());
        browserHistory.goBack();
        System.out.println(browserHistory.getCurrentPage());
        browserHistory.goBack();
        System.out.println(browserHistory.getCurrentPage());
    }
}
