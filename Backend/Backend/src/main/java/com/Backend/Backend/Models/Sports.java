package com.Backend.Backend.Models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "sports")
@Data
public class Sports {
    @Id
    private String id;

    @Indexed(unique = true)
    private String name; // e.g., "Cricket", "Badminton"

    private String description;
    private String rulebookUrl; // URL to the PDF in your frontend/S3
    private String venue;
    private List<String> coordinators; // Names of the Co-Cos
    private List<String> pools; // e.g., ["Pool A", "Pool B"]
}
