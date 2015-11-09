package demo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document
@Data
public class Ticket {

  @Id
  private String id;

  private String description;

  private Map<String, Object> properties;
}