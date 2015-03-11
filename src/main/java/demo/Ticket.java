package demo;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class Ticket {

	@Id
	private String id;

	@Version
	private Long version;

	private String type;

	private Map<String, String> texts;

	public String getId() {
		return id;
	}

	public Map<String, String> getTexts() {
		return texts;
	}

	public String getType() {
		return type;
	}

	public Long getVersion() {
		return version;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTexts(Map<String, String> texts) {
		this.texts = texts;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}
