package by.pvt.core.convert;

import by.pvt.api.dto.shopDTO.UserRequest;
import by.pvt.api.dto.shopDTO.UserResponse;
import by.pvt.core.domain.User;

public class UserConvert {

    //Из ДТО в сущность
    public User userToEntity(UserRequest userRequest) {
        User user = User.builder()
                .id(userRequest.getId())
                .firstName(userRequest.getFirstName())
                .surName(userRequest.getSurName())
                .age(userRequest.getAge())
                .phoneNumber(userRequest.getPhoneNumber())
                .email(userRequest.getEmail())
                .lastVisitDate(userRequest.getLastVisitDate())
                .amountSum(userRequest.getAmountSum())
                .build();
        return user;
    }

    //To Object
    public UserResponse userToDTO(User user) {
        UserResponse dto = UserResponse.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .surName(user.getSurName())
                .age(user.getAge())
                .phoneNumber(user.getPhoneNumber())
                .email(user.getEmail())
                .lastVisitDate(user.getLastVisitDate())
                .amountSum(user.getAmountSum())
                .build();

        return dto;
    }

}
