package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private final Deque<String> stack = new ArrayDeque<>();
    private String currentPage;

    public void visitPage(String page) {
        stack.push(page);
        currentPage = page;
    }

    public String goBack() {
        if (!stack.isEmpty()) {
            String prevPage = stack.pop();
            currentPage = prevPage;
            return prevPage;
        }
        return null;
    }

    public String getCurrentPage() {
        return currentPage;
    }
}
