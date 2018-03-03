package akka.reporter.report;

public class Report {
    protected Type type = Type.NONE;
    protected String message;

    public Type getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    protected Report() {

    }

    protected Report(String message) {
        this.message = message;
    }

    protected Report(String message, Type type) {
        this(message);
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("[ %s ] %s", type, message);
    }

    public static Report create(String message) {
        return new Report(message);
    }

    public static Report create(String message, Type type) {
        return new Report(message, type);
    }
}