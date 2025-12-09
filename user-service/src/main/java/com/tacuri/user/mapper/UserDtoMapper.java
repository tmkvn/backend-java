package com.tacuri.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.tacuri.user.domain.User;
import com.tacuri.user.dto.UserDto;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserDtoMapper {
    
    UserDtoMapper INSTANCE = Mappers.getMapper(UserDtoMapper.class);
    
    User toDomain(UserDto dto);

    UserDto toDto(User domain);
}
