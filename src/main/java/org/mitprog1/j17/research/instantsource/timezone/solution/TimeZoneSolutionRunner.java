package org.mitprog1.j17.research.instantsource.timezone.solution;

import java.time.Instant;
import java.time.InstantSource;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class TimeZoneSolutionRunner {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        InstantSource instantSource = InstantSource.fixed(now.toInstant(ZoneOffset.UTC));
        Instant instant = instantSource.instant();

        System.out.println("Instant = "+instant);
    }
}
