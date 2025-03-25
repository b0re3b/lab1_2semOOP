package org.aviacompany.Model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Flights {
   private final int flightId;
   private String flightNumber;
   private String  departureAirport;
   private String arrivalAirport;
   private String departureTime;
   private String arrivalTime;
   private enum Status {Arrived,Flies,Postponed,Cancelled,Take_oof,Planned}
}
