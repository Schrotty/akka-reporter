package de.rubenmaurer.akka.reporter.report;

/**
 * Basic report for reporting.
 *
 * @author Ruben Maurer
 * @version 1.0
 */
public class Report {

    /**
     * The report type
     */
    protected Type type;

    /**
     * The report message
     */
    protected String message;

    /**
     * Constructs a new report.
     */
    protected Report() {
        type = Type.NONE;
    }

    /**
     * Constructs a new report.
     *
     * @param message the message
     */
    protected Report(String message) {
        this();
        this.message = message;
    }

    /**
     * Constructs a new report.
     *
     * @param message the message
     * @param type    the type
     */
    protected Report(String message, Type type) {
        this(message);
        this.type = type;
    }

    /**
     * Create a new report.
     *
     * @param message the report message
     * @return the recently created report
     */
    public static Report create(String message) {
        return new Report(message);
    }

    /**
     * Create a new report.
     *
     * @param message the report message
     * @param type    the type of this report
     * @return the recently created report
     */
    public static Report create(String message, Type type) {
        return new Report(message, type);
    }

    /**
     * Get the report type.
     *
     * @return the type
     */
    public Type getType() {
        return type;
    }

    /**
     * Get the report message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Gets the string representation of this report.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return String.format("[ %s ] %s", type, message);
    }
}