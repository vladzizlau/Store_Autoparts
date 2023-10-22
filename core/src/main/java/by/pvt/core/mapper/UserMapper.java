package by.pvt.core.mapper;

import by.pvt.api.dto.shopDTO.UserRequest;
import by.pvt.api.dto.shopDTO.UserResponse;
import by.pvt.core.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserResponse toResponse(User user);
    User toEntity(UserRequest request);
}
