package com.Backend.Backend.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "colleges")
@Data
public class College {
    @Id
    private String id;
    @Indexed(unique = true)
    private String collegeName;
    private String contactNumber;
private int totalGustoPoints=0;
}
