package io.github.mokaim.common.repository;

import io.github.mokaim.common.entity.User;
import io.github.mokaim.common.repository.querydsl.interfaces.UserQueryDsl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserQueryDsl {
}
