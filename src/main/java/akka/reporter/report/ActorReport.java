package akka.reporter.report;

import akka.actor.ActorRef;

public class ActorReport extends Report {
    private ActorRef actor;

    private ActorReport(ActorRef actor, Type type) {
        this.type = type;
        this.actor = actor;
    }

    @Override
    public String toString() {
        return String.format("[ %s ] %s", type, actor);
    }

    public static ActorReport create(ActorRef actor, Type type) {
        return new ActorReport(actor, type);
    }
}
