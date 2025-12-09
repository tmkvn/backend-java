package com.tacuri.user.mapper;

import java.util.List;

import org.mapstruct.factory.Mappers;

import com.tacuri.user.domain.User;
import com.tacuri.user.entity.UserEntity;

public interface UserEntityMapper {

    UserEntityMapper INSTANCE = Mappers.getMapper(UserEntityMapper.class);

    UserEntity toEntity(User user);
    List<UserEntity> toEntities(List<User> users);

    User toDomain(UserEntity userEntity);
    List<User> toDomains(List<UserEntity> userEntities);

}
