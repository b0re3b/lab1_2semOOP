package org.aviacompany.Model;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Admin {
    final int id;
    final String name;
    final String password;
    enum role_admin {manager,operator,admin,superadmin};

}
