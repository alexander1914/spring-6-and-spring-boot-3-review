package github.alexander1914.springjpa.restfull.repository;

import github.alexander1914.springjpa.restfull.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
