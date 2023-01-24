package example.example4;

public class Letter {

    private final String sender;

    public Letter(String sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "sender='" + sender + '\'' +
                '}';
    }

}
