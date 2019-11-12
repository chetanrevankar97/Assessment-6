package repo;

import java.util.List;

import modal.Track;

public interface TrackDAL {
	
	public List<Track> findAll();
	
	public Track save(Track t);
}
