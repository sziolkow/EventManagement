package org.sziolkow.eventmanagement.persistence.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;

@Entity
@Data
@Table(name = "participant")
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    @ManyToMany(mappedBy = "participants")
    private HashSet<Event> events = new HashSet<>();

}
