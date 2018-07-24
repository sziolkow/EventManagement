package org.sziolkow.eventmanagement.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventParticipantId implements Serializable {

    @Column(name = "event_id")
    private Long eventId;

    @Column(name = "participant_id")
    private Long participantId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        EventParticipantId that = (EventParticipantId) o;
        return Objects.equals(eventId, that.eventId) &&
                Objects.equals(participantId, that.participantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, participantId);
    }
}
