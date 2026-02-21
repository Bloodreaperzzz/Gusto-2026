package com.Backend.Backend.Models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "matches")
@Data
public class Match {
    @Id
    private String id;

    private String sportName; // Links to the Sport model name
    private String teamA;
    private String teamB;
    private String scoreA; // String allows for Cricket scores like "120/4"
    private String scoreB;

    private String status; // SCHEDULED, LIVE, FINISHED
    private String round; // e.g., "Quarter Final", "League"
    private LocalDateTime matchTime;
    private String location;
}
