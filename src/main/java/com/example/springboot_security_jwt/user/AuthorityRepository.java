package com.example.springboot_security_jwt.user;

import com.example.springboot_security_jwt.user.model.*;
import org.springframework.data.jpa.repository.*;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
}
