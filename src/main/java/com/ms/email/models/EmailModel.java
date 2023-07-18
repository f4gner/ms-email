package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel {
    private static final long seriaVersionUID =1L;
    public static String getEmailFrom;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long emailId;
    private  String ownerRef;
    private  String emailFrom;
    private  String emailTo;
    private  String subJect;

    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateTimeEmail;
    private StatusEmail statusEmail;
}
