package akka.reporter;

import akka.actor.AbstractActor;
import akka.actor.Props;
import akka.reporter.report.Report;

public class Reporter extends AbstractActor {

    private void processReport(Report report) {
        System.out.println(report == null ? "" : report);
    }

    public static Props props() {
        return Props.create(Reporter.class);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder().match(Report.class, this::processReport).build();
    }
}
