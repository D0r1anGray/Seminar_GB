package task1.Clients;

public class Illness {
    String illness;

    public Illness(String illness) {
        this.illness = illness;
    }

    @Override
    public String toString() {
        return String.format("%s", illness);
    }
}
