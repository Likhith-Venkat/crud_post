package com.lv.jobsposting.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="users")
public class User implements Serializable {
    @Id
    private String username;
    private String email;
    private String password;
    private String type;
    private String access;
}