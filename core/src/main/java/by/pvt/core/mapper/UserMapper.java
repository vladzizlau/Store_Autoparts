package by.pvt.core.mapper;

import by.pvt.api.dto.shopDTO.UserRequest;
import by.pvt.api.dto.shopDTO.UserResponse;
import by.pvt.core.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper
    {

    UserResponse toResponse(User user);

    @Mapping(target = "id", ignore = true)
    User toEntity(UserRequest request);
    @Mapping(target = "password", ignore = true)
    List<UserResponse> toResponseList(List<User> userList);
    }
