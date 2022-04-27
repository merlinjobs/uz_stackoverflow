package uz_stackoverflow.beta.com.data.dao;

import uz_stackoverflow.beta.com.data.model.Roles;

import java.util.Set;

public interface RolesDao {
    void newRole(Set<Roles> role);
    void getRole();
}
