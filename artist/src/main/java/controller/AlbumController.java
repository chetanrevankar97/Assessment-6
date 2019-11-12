package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import modal.Album;
import repo.AlbumDAL;

@RestController
public class AlbumController {

	@Autowired
	private AlbumDAL albumrepo;
	
	@PostMapping("/albums")
	public Album create(@RequestBody Album a){
		return albumrepo.save(a);
	}
	
	@GetMapping("/albums")
	public List<Album> findAll(){
		return albumrepo.findAll();
	}
}
