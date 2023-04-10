package br.com.userdepartment.api.repository;

import br.com.userdepartment.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
