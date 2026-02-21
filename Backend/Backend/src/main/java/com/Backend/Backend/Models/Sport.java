package com.Backend.Backend.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "sports")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sport {
    @Id
    private String id;

    @Indexed(unique = true)
    private String name; // e.g., "Cricket", "Badminton"

    private String description;
    private String rulebookUrl;
    private int minMembers;
    private int maxMembers;// URL to the PDF in your frontend/S3
    private String venue;
    private String Coodinator;
    private String Co_Coordinator;
    // Names of the Co-Cos
    private List<String> pools; // e.g., ["Pool A", "Pool B"]
}
