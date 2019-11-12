package controller;
import repo.ArtistDAL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import modal.Artist;

@RestController
public class ArtistController {

	@Autowired
	private ArtistDAL artistrepo;
	
	@PostMapping("/artists")
	public Artist create(@RequestBody Artist a){
		return artistrepo.save(a);
	}
	
	@GetMapping("/artists")
	public List<Artist> findAll(){
		return artistrepo.findAll();
	}
}
