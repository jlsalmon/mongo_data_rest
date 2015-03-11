package demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "ticket", collectionResourceRel = "ticket")
public interface TicketRepository extends MongoRepository<Ticket, String> {

}