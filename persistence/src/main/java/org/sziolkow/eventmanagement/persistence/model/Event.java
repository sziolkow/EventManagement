package org.sziolkow.eventmanagement.persistence.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashSet;

@Entity
@Data
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String title;

    @NotNull
    private Integer capacity;

    @NotNull
    private Boolean active;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "event_participient",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "participient_id")
    )
    private HashSet<Participant> participants = new HashSet<>();


    public void addParticipient(Participant participant) {
        participants.add(participant);
        participant.getEvents().add(this);
    }

    public void removeTag(Participant participant) {
        participants.remove(participant);
        participant.getEvents().remove(this);
    }
}
