package de.rubenmaurer.akka.reporter.report;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for the simple report.
 *
 * @author Ruben Maurer
 * @version 1.0
 */
class ReportTest {

    /**
     * Create a report with message and type.
     *
     * @param message the message
     * @param type    the type
     * @return the recently created report
     */
    private Report createFullReport(String message, Type type) {
        return Report.create(message, type);
    }

    /**
     * Create a report only with a message.
     *
     * @param message the message
     * @return the recently created message
     */
    private Report createMessageReport(String message) {
        return Report.create(message);
    }

    @Test
    void getTypeTest() {
        assertEquals(createFullReport("Herman", Type.INFO).getType(), Type.INFO);
        assertEquals(Type.NONE, createMessageReport("Herman").getType());
    }

    @Test
    void getMessageTest() {
        assertEquals("Herman", createMessageReport("Herman").getMessage());
    }

    @Test
    void toStringTest() {
        assertEquals("[ ERROR ] FAILURE", createFullReport("FAILURE", Type.ERROR).toString());
        assertEquals("[ NONE ] FAILURE", createMessageReport("FAILURE").toString());
    }
}