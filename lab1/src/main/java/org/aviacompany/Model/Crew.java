package org.aviacompany.Model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import java.util.Map;

@Slf4j
@Data
public class Crew {
    private final int crewId;
    private int flightId;


    private Map<String, Integer> staffRoleMap;

    public Crew(int crewId, int flightId, Map<String, Integer> staffRoleMap) {
        this.crewId = crewId;
        this.flightId = flightId;
        this.staffRoleMap = staffRoleMap;
    }
}
