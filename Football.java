public class Football extends Abs {
    public Football(String name, String team) {
        super(name, team);
    }

    @Override
    void details() {
        System.out.println("Footballer\n name=" + super.name + " team=" + super.team);
    }
}
