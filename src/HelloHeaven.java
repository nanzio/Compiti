public class HelloHeaven {
    private String message;
    private String virus;

    public HelloHeaven(String message, String virus) {
        this.message = message;
        this.virus = virus;
    }

    public HelloHeaven() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getVirus() {
        return virus;
    }

    public void setVirus(String virus) {
        this.virus = virus;
    }
}
