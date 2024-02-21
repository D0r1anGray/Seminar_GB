package task1.Information;

public class Owner {
    String fullname;

    public Owner(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return String.format("%s", fullname);
    }
}
