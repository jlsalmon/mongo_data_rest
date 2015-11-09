package demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface TicketRepository extends MongoRepository<Ticket, String> {

}