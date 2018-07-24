package org.sziolkow.eventmanagement.persistence.model;

//@Entity
//@Table(name = "event_participant")
public class EventParticipant {
/*
        @EmbeddedId
        private EventParticipantId id;

        @ManyToOne(fetch = FetchType.LAZY)
        @MapsId("eventId")
        private Event event;

        @ManyToOne(fetch = FetchType.LAZY)
        @MapsId("participantId")
        private Participant participant;

        @Column(name = "created_on")
        private Date createdOn = new Date();

        private EventParticipant() {}

        public EventParticipant(Event event, Participant participant) {
            this.event = event;
            this.participant = participant;
            this.id = new EventParticipantId(event.getId(), participant.getId());
        }

        //Getters and setters omitted for brevity

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass())
                return false;

            EventParticipant that = (EventParticipant) o;
            return Objects.equals(event, that.event) &&
                    Objects.equals(participant, that.participant);
        }

        @Override
        public int hashCode() {
            return Objects.hash(event, participant);
        }
        */
}
