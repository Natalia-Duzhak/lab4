package lpnu.dto;



import lpnu.entity.enumeration.UserSkinCondition;
import lpnu.entity.enumeration.UserSkinType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class UserDTO {
    private Long id;
    @NotBlank
    private String name;
    @NotNull
    private Integer age;

    private UserSkinType skinType;
    private UserSkinCondition skinCondition;

    @NotBlank
    private String email;

    public UserDTO() {}

    public UserDTO(final Long id,final String name, final Integer age, final String email){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public UserSkinType getSkinType() {
        return skinType;
    }

    public void setSkinType(final UserSkinType skinType) {
        this.skinType = skinType;
    }

    public UserSkinCondition getSkinCondition() {
        return skinCondition;
    }

    public void setSkinCondition(final UserSkinCondition skinCondition) {
        this.skinCondition = skinCondition;
    }


}
