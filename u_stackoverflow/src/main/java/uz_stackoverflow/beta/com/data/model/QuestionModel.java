package uz_stackoverflow.beta.com.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class QuestionModel {

    private Date createdDate;
    private int qScore;


}
