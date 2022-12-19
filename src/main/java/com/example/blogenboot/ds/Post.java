package com.example.blogenboot.ds;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate datePosted;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;
}
