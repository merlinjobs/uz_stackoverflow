package uz_stackoverflow.beta.com.data.dao;

import uz_stackoverflow.beta.com.data.model.QuestionModel;

public interface QuestionModelDao {
    void createQ(QuestionModel qModel);
    void updateQ(QuestionModel qModel);
    void removeQ(Long id);
    QuestionModel findQByName(String qName);

}
