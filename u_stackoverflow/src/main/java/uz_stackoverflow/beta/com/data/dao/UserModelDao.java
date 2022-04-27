package uz_stackoverflow.beta.com.data.dao;

import uz_stackoverflow.beta.com.data.model.QuestionModel;
import uz_stackoverflow.beta.com.data.model.UsersModel;

import java.util.List;

public interface UserModelDao {
    UsersModel getUser(Long id);
    QuestionModel findOneQ(Long id);
    List<QuestionModel> listQ (Long id);
    void createUser(UsersModel usersModel);
    void updateUser(UsersModel usersModel);
    void removeUser(Long id);
}
