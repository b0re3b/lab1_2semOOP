package org.aviacompany.Model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Flights {
    final int flightId;
    String flightNumber;
    String departureAirport;
    String arrivalAirport;
    String departureTime;
    String arrivalTime;
    enum Status {Arrived,Flies,Postponed,Cancelled,Take_oof,Planned}
}
