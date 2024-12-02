package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private final String id;

    public UserV2(String id) {
        this.id = id;
    }
/*
    // 직접구현
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof UserV2 user)) return false;
        return this.id.equals(user.id);
    }
*/


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
