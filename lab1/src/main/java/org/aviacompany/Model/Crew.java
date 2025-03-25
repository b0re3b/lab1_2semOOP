package org.aviacompany.Model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Crew {
    final int crewId;
    final int flightId;
    final int pilotId;
    final int coPilotId;
    final int navigatorId;
    final int radOperId;
    final int stewardId;

}
