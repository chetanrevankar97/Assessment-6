package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import modal.Track;
import repo.TrackDAL;

@RestController
public class TrackController {

	@Autowired
	private TrackDAL trackrepo;
	
	@PostMapping("/tracks")
	public Track create(@RequestBody Track t){
		return trackrepo.save(t);
	}
	
	@GetMapping("/tracks")
	public List<Track> findAll(){
		return trackrepo.findAll();
	}
}
