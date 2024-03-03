import java.util.*;

public abstract class Abs {
    String name, team;

    public Abs(String name, String team) {
        this.name = name;
        this.team = team;
    }

    abstract void details();
}
