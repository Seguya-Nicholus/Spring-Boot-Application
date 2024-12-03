package org.codewithme.SpringStarter.repositories;

import org.codewithme.SpringStarter.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    
}
