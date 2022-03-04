package io.github.mokaim.common.repository.querydsl.interfaces;

import io.github.mokaim.common.entity.User;
import java.util.List;

public interface UserQueryDsl {
  List<User> fetchAll();
}
