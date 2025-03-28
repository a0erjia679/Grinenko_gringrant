package ru.dms.gringrant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dms.gringrant.model.User;

public interface UserRepository  extends JpaRepository<User, Long> {
}
