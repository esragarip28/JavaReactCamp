package com.kodlamaio.hrms.entities.concretes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="language_skills")
public class LanguageSkill {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "language_name")
    private String languageName;

    @Column(name="language_level")
    private int level;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="resume_id")
    private Resume resume;

}
