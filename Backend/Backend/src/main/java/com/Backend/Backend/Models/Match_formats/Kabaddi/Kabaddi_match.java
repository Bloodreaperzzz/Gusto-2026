package com.Backend.Backend.Models.Match_formats.Kabaddi;

import com.Backend.Backend.Models.Match;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Kabaddi_match extends Match {
    private int pointsA;
    private int pointsB;

    private int half;


}
