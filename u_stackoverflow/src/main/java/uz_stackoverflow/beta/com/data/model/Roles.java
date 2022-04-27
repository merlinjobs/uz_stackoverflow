package uz_stackoverflow.beta.com.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Roles {

    private Long id;
    private String role;
    private Set<UsersModel> users;


}
