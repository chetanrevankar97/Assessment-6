package repo;

import java.util.List;

import modal.Album;

public interface AlbumDAL {

	public List<Album> findAll();
	
	public Album save(Album a);
}
