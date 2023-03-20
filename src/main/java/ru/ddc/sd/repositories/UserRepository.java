package ru.ddc.sd.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.ddc.sd.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
