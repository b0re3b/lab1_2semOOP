package org.aviacompany.Model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Staff {
    final int id;
    final String firstName;
    final String lastName;
    int seniority;
    int license_number;
    enum role_staff {pilot,co_pilot,navigator,radiooperator,stewardess}
}
