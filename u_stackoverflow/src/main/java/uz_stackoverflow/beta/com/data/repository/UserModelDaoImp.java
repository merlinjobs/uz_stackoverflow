package uz_stackoverflow.beta.com.data.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import uz_stackoverflow.beta.com.data.dao.UserModelDao;
import uz_stackoverflow.beta.com.data.model.QuestionModel;
import uz_stackoverflow.beta.com.data.model.UsersModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserModelDaoImp implements UserModelDao {

    private JdbcTemplate jdbc;

    @Autowired
    public UserModelDaoImp (JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public UsersModel getUser (Long id) {
        return jdbc.queryForObject("select uid, name, login, email, password, posts where id = ?",
                new RowMapper<UsersModel>() {
                    @Override
                    public UsersModel mapRow (ResultSet rs, int rowNum) throws SQLException {
                        return new UsersModel(
                                Long.parseLong(rs.getString("uid")),
                                rs.getString("name"),
                                rs.getString("userEmail"),
                                rs.getString("login"),
                                rs.getString("password"),
                                rs.getString("posts")
                        );
                    }
                }, id);
    }

    @Override
    public QuestionModel findOneQ (Long id) {
        return ;
    }

    @Override
    public List<QuestionModel> listQ (Long id) {
        return null;
    }

    @Override
    public void createUser (UsersModel usersModel) {

    }

    @Override
    public void updateUser (UsersModel usersModel) {

    }

    @Override
    public void removeUser (Long id) {

    }
}
