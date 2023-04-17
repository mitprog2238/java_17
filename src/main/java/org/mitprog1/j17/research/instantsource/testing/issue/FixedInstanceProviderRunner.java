package org.mitprog1.j17.research.instantsource.testing.issue;

import org.mitprog1.j17.research.instantsource.testing.InstantExample;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class FixedInstanceProviderRunner {
    public static void main(String[] args) {
        // given
        LocalDateTime now = LocalDateTime.now();
        InstantExample tested = new InstantExample(InstantWrapper.of(now), null);
        Instant currentInstant = now.toInstant(ZoneOffset.UTC);
// when
        Instant returnedInstant = tested.getCurrentInstantFromWrapper();
// then
//        assertEquals(currentInstant, returnedInstant);
        System.out.println(currentInstant.equals(returnedInstant));
    }
}
