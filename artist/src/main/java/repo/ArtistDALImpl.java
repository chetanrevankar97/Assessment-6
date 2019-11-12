package repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


import modal.Artist;

@Repository
public class ArtistDALImpl implements ArtistDAL{

	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public List<Artist> findAll() {
		return mongo.findAll(Artist.class);
	}

	@Override
	public Artist save(Artist a) {
		return mongo.save(a);
	}
}
