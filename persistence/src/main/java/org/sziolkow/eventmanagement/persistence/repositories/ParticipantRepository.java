package org.sziolkow.eventmanagement.persistence.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.sziolkow.eventmanagement.persistence.model.Participant;

@RepositoryRestResource(collectionResourceRel = "participants", path = "participants")
interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {
}
