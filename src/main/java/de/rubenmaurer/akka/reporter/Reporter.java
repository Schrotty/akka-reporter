package de.rubenmaurer.akka.reporter;

import akka.actor.AbstractActor;
import akka.actor.Props;
import de.rubenmaurer.akka.reporter.report.Report;

/**
 * Reporter actor for processing incoming reports.
 *
 * @author Ruben Maurer
 * @version 1.0
 */
public class Reporter extends AbstractActor {

    /**
     * Get props for actor creation.
     *
     * @return the props
     */
    public static Props props() {
        return Props.create(Reporter::new);
    }

    /**
     * Process an incoming report.
     *
     * @param report the report to process
     */
    private void processReport(Report report) {
        System.out.println(report == null ? "" : report);
    }

    /**
     * Receives messages and process them.
     *
     * @return a receive object
     */
    @Override
    public Receive createReceive() {
        return receiveBuilder().match(Report.class, this::processReport).build();
    }
}
