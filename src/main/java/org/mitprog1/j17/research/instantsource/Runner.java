package org.mitprog1.j17.research.instantsource;

import java.time.Clock;
import java.time.ZoneId;

public class Runner {

    public static void main(String[] args) {
        // creating a Clock instance using
        // systemUTC() method of Clock class
        Clock clock = Clock.systemUTC();
        Clock clock2 = Clock.systemDefaultZone();
        ZoneId zoneId = clock.getZone();
        ZoneId zoneId2 = clock2.getZone();
        // getting the current instant defined by clock
        System.out.println("UTC time = " + clock2.instant());
        System.out.println("UTC time Zone : " + zoneId);

        System.out.println("Default time = " + clock.instant());
        System.out.println("Default time Zone : " + zoneId2);

    }
}
