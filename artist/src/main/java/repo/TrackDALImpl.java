package repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import modal.Track;

@Repository
public class TrackDALImpl implements TrackDAL{

	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public List<Track> findAll() {
		return mongo.findAll(Track.class);
	}

	@Override
	public Track save(Track t) {
		return mongo.save(t);
	}
}
