package com.romanstetsiuk.final_app_sda.repository;

import com.romanstetsiuk.final_app_sda.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
