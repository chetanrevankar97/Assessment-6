package repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import modal.Album;

@Repository
public class AlbumDALImpl implements AlbumDAL{
	
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public List<Album> findAll() {
		return mongo.findAll(Album.class);
	}

	@Override
	public Album save(Album a) {
		return mongo.save(a);
	}
}
