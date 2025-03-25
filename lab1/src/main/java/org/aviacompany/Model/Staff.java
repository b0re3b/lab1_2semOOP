package org.aviacompany.Model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Staff {
   private final int id;
   private final String firstName;
   private final String lastName;
   private int seniority;
   private int license_number;
   private enum role_staff {pilot,co_pilot,navigator,radiooperator,stewardess}
}
