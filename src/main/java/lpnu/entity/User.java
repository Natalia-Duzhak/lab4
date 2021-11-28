package lpnu.entity;

import lpnu.entity.enumeration.UserSkinCondition;
import lpnu.entity.enumeration.UserSkinType;

import java.util.Objects;

public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private UserSkinType skinType;
    private UserSkinCondition skinCondition;


   public User(){}

   public User(final Long id,final String name,final Integer age, final String email, final UserSkinType userSkinType, final UserSkinCondition skinCondition){
       this.id = id;
       this.name = name;
       this.age = age;
       this.email = email;
       this.skinType = userSkinType;
       this.skinCondition = skinCondition;
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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(age, user.age) && Objects.equals(email, user.email) && skinType == user.skinType && skinCondition == user.skinCondition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, email, skinType, skinCondition);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", skinType=" + skinType +
                ", skinCondition=" + skinCondition +
                '}';
    }
}
