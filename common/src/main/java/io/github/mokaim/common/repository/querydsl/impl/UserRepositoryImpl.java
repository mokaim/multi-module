package io.github.mokaim.common.repository.querydsl.impl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import io.github.mokaim.common.entity.User;
import io.github.mokaim.common.repository.querydsl.interfaces.UserQueryDsl;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static io.github.mokaim.common.entity.QUser.user;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserQueryDsl {

  private final JPAQueryFactory query;

  @Override
  public List<User> fetchAll() {
    return query.from(user)
        .select(user)
        .fetch();
  }
}
