package com.Backend.Backend.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "matches")
@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class Match {
    @Id
    private String id;

    private String sportId;
    private String teamAId;
    private String teamBId;
    private LocalDateTime startTime;
    private String status;
    private String winnerTeadID;


}
