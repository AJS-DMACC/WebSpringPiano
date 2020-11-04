package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.*;
import dmacc.repository.PianoRepository;

@Controller
public class WebController {
	@Autowired
	PianoRepository repo;

	@GetMapping({ "/", "viewAll" })
	public String viewAllPianos(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewPiano(model);
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		model.addAttribute("pianos", repo.findAll());
		return "results";
	}

	@GetMapping("/inputPiano")
	public String addNewPiano(Model model) {
		Piano p = new Piano();
		model.addAttribute("newPiano", p);
		return "input";
	}

	@PostMapping("/inputPiano")
	public String addNewContact(@ModelAttribute Piano p, Model model) {
	repo.save(p);
	return viewAllPianos(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateContact(@PathVariable("id") long id, Model model) {
		Piano p = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + p.toString());
		model.addAttribute("newPiano", p);
		System.out.println("----New Piano's ID:" + p.getSerialNum());
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseContact(Piano p, Model model) {		
		System.out.println(p.toString());
		repo.save(p);
		return viewAllPianos(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long num, Model model) {
		Piano p = repo.findById(num).orElse(null);
	    repo.delete(p);
	    return viewAllPianos(model);
	}
}