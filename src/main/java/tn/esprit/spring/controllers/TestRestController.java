package tn.esprit.spring.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.*;
import tn.esprit.spring.repository.*;

import java.util.List;

@RestController
@Api(tags = "test")
@RequestMapping("/test")
public class TestRestController {

	@Autowired
	UserRepository userR;
	@Autowired
	AnnoucementRepository annoucementRepository;

	@Autowired
	ContratRepository contratRepository;

	@Autowired
	InsurranceRepository insurranceRepository;

	@Autowired
	MessageRepository messageRepository ;

	@Autowired
	OfferRepository offerRepository;

	@Autowired
	SubscriptionRepository subscriptionRepository;

	@Autowired
	VisitRepository visitRepository;
	@Autowired
	ArticleRepository articleRepository;

	
    //http://localhost:8081/SpringMVC/swagger-ui/index.html

	@ApiOperation(value = "Récupérer la liste des examens")
	@GetMapping("/retrieve/allUsers")
	@ResponseBody
	public List<UserA> getUsers() {
		return userR.findAll();
	}

	@ApiOperation(value = "Récupérer la liste des examens")
	@GetMapping("/retrieve/all")
	@ResponseBody
	public List<Announcement> getAnnoucement() {
		return annoucementRepository.findAll();
	}

	@ApiOperation(value = "Récupérer la liste des examens")
	@GetMapping("/retrieve/allArticle")
	@ResponseBody
	public List<Article> getArticles() {
		return articleRepository.findAll();
	}

	@ApiOperation(value = "Récupérer la liste des examens")
	@GetMapping("/retrieve/allContrat")
	@ResponseBody
	public List<Contrat> getContrat() {
		return contratRepository.findAll();
	}

	@ApiOperation(value = "Récupérer la liste des examens")
	@GetMapping("/retrieve/allInsurrance")
	@ResponseBody
	public List<Insurance> getInsurrance() {
		return insurranceRepository.findAll();
	}

	@ApiOperation(value = "Récupérer la liste des examens")
	@GetMapping("/retrieve/allMessage")
	@ResponseBody
	public List<Message> getMessasge() {
		return messageRepository.findAll();
	}

	@ApiOperation(value = "Récupérer la liste des examens")
	@GetMapping("/retrieve/allOffer")
	@ResponseBody
	public List<Offer> getOffer() {
		return offerRepository.findAll();
	}

	@ApiOperation(value = "Récupérer la liste des examens")
	@GetMapping("/retrieve/allSubscription")
	@ResponseBody
	public List<Subscription> getSubscriptions() {
		return subscriptionRepository.findAll();
	}

	@ApiOperation(value = "Récupérer la liste des examens")
	@GetMapping("/retrieve/allVisits")
	@ResponseBody
	public List<Visit> getVisits() {
		return visitRepository.findAll();
	}

	@PostMapping("/add-contrat")
	public Contrat addContrat(@RequestBody Contrat ce) {
		Contrat contrat = contratRepository.save(ce);
		return contrat;
	}

	@PostMapping("/add-insurrance")
	public Insurance addContrat(@RequestBody Insurance ce) {
		Insurance contrat = insurranceRepository.save(ce);
		return contrat;
	}




}
