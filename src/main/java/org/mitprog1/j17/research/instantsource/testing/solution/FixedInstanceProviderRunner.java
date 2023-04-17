package org.mitprog1.j17.research.instantsource.testing.solution;

import org.mitprog1.j17.research.instantsource.testing.InstantExample;

import java.time.Instant;
import java.time.InstantSource;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class FixedInstanceProviderRunner {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        InstantSource instantSource = InstantSource.fixed(now.toInstant(ZoneOffset.UTC));
        InstantExample tested = new InstantExample(null, instantSource);
        Instant currentInstant = instantSource.instant();
// when
        Instant returnedInstant = tested.getCurrentInstantFromInstantSource();
// then
//        assertEquals(currentInstant, returnedInstant);
        System.out.println(currentInstant.equals(returnedInstant));
    }
}
