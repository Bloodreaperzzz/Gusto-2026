package com.Backend.Backend.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Document(collection = "teams")
public class Sport_team {
    @Id
    private String id;
    private String collegeId;
    private String sportId;
    private List<String>playerNames;
    private int sportPoints=0;
}
