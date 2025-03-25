package org.aviacompany.Model;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Admin {
   private final int id;
   private final String name;
   private final String password;
   private enum role_admin {manager,operator,admin,superadmin};

}
