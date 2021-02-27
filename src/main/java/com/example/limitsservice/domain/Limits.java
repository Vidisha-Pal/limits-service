package com.example.limitsservice.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Limits {

    private int minimum;

    private int maximum;
}
