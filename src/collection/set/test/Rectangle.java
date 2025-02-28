package collection.set.test;

import java.util.Objects;

public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public boolean equals(Object r) {
        if (!(r instanceof Rectangle rectangle)) {
            return false;
        }
        return this.width == rectangle.width && this.height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
            "width=" + width +
            ", height=" + height +
            '}';
    }
}
