package lpnu.mapper;

import lpnu.dto.UserDTO;
import lpnu.entity.User;
import org.springframework.stereotype.Component;


@Component
public class UserToUserDTOMapper {

    public User toEntity(final UserDTO userDTO){
        final User user = new User();

        user.setId(userDTO.getId());
        user.setEmail(userDTO.getEmail());
        user.setName(userDTO.getName());
        user.setAge(userDTO.getAge());
        user.setSkinType(userDTO.getSkinType());
        user.setSkinCondition(userDTO.getSkinCondition());




        return user;
    }
    public UserDTO toDTO(final User user){
        final UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setName(user.getName());
        userDTO.setAge(user.getAge());
        userDTO.setSkinType(user.getSkinType());
        userDTO.setSkinCondition(user.getSkinCondition());




        return userDTO;
    }
    
}
