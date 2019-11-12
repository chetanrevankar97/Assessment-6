package modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="Tracks2")
public class Track {
	
	private String id;
	private String name;
	@DBRef
	private Artist aname;
	
	public Track() {
		super();
	}

	public Track(String id, String name, Artist aname) {
		super();
		this.id = id;
		this.name = name;
		this.aname = aname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Artist getAname() {
		return aname;
	}

	public void setAname(Artist aname) {
		this.aname = aname;
	}
	
	
	
}
