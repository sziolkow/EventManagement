package org.sziolkow.eventmanagement.persistence.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.sziolkow.eventmanagement.persistence.model.Event;

@RepositoryRestResource(collectionResourceRel = "events", path = "events")
interface EventRepository extends PagingAndSortingRepository<Event, Long> {
}
