package de.rubenmaurer.akka.reporter.report;

import akka.actor.ActorRef;

/**
 * Actor report for reporting the status of a single actor.
 *
 * @author Ruben Maurer
 * @version 1.0
 */
public class ActorReport extends Report {

    /**
     * The actor which is reporting.
     */
    private ActorRef actor;

    /**
     * Constructs a new report.
     *
     * @param actor the actor which is reporting
     * @param type  the type of this report
     */
    private ActorReport(ActorRef actor, Type type) {
        this.type = type;
        this.actor = actor;
    }

    /**
     * Create a new report.
     *
     * @param actor the actor which is reporting
     * @param type  the type of this report
     * @return the recently created report
     */
    public static ActorReport create(ActorRef actor, Type type) {
        return new ActorReport(actor, type);
    }

    /**
     * Gets the string representation of this report.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return String.format("[ %s ] %s", type, actor);
    }
}
