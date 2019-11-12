package repo;

import java.util.List;

import modal.Artist;

public interface ArtistDAL {
	
	public List<Artist> findAll();
	
	public Artist save(Artist a);
}
