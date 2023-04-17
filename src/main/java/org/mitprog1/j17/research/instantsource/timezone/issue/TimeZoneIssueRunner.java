package org.mitprog1.j17.research.instantsource.timezone.issue;

import java.time.*;

public class TimeZoneIssueRunner {
    public static void main(String[] args) {

//        The issue
        Instant instant1 = Clock.systemDefaultZone().instant();
        System.out.println("Instant 1 = "+instant1);

        Instant instant2 = LocalDateTime.now().toInstant(ZoneOffset.UTC);
        System.out.println("Instant 2 = "+instant2);
// -----------
//      The current default implementation in Java 17 is the Clock.SystemInstantSource class.
        Instant instant3 = InstantSource.system().instant();
        System.out.println("Instant 3 = "+instant3);

    }
}
