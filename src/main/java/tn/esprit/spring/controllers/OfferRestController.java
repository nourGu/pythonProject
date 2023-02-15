package tn.esprit.spring.controllers;


import com.fasterxml.jackson.core.PrettyPrinter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.Offer;
import tn.esprit.spring.entities.Subscription;
import tn.esprit.spring.repository.OfferRepository;
import tn.esprit.spring.service.OfferService;
import tn.esprit.spring.service.SubscriptionService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@Api(tags = "offer")
@RequestMapping("/offer")
public class OfferRestController {

    @Autowired
    OfferService offerService;

    @Autowired
    OfferRepository offerRepository;


///////// ADD SUBSCRIPTION ///////////////////
    @ApiOperation(value = "Récupérer la liste des examens")
    @PostMapping("/add/offer")
    @ResponseBody
    public Offer addOffer(@RequestBody Offer offer) {
        Offer off= offerService.addOffer(offer);
        return off;
    }

//////// GET ALL SUBSCRIPTIONS ///////////////////
    @ApiOperation(value = "Récupérer la liste des examens")
    @GetMapping("/retrieve/allOffers")
    @ResponseBody
    public List<Offer> getOffers() {
        return offerService.getAllOffers();
    }

//////// DELETE SUBSCRIPTION ///////////////////

    @ApiOperation(value = "Récupérer la liste des examens")
    @DeleteMapping("/delete/offer/{id}")
    public void deleteOffer(@PathVariable("id") Long id) {
         offerService.deletetOffer(id);
    }



   @Scheduled(cron = "0 * * ? * *")
   public void cronMethod() {
       Date curDate = new Date();
       List<Offer> offers = offerService.getAllOffers();
       List<Long> expirationSoonList = new ArrayList<>();
       for (Offer o : offers) {
           Date date2 = o.getExpirationDate();
           int diffInDays = (int) ((date2.getTime() - curDate.getTime())
                   / (1000 * 60 * 60 * 24));
           if (diffInDays == 7) {
               expirationSoonList.add(o.getIdOffer());
           }

       } System.out.println("list of offers that will expire in 7 days :"+expirationSoonList);
   }


   /* @GetMapping("/date")
    public List<Offer> cronMethod1() {
        Date curDate = new Date();
        List<Offer> offers = offerService.getAllOffers();
        List<Offer> expirationSoonList = new ArrayList<>();
        for (Offer o : offers) {
            Date date2 = o.getExpirationDate();
            int diffInDays = (int) ((date2.getTime() - curDate.getTime())
                    / (1000 * 60 * 60 * 24));
            if (diffInDays == 7) {
                expirationSoonList.add(o);
            }

        } //System.out.println("list of offers that will expire in 7 days :"+expirationSoonList);
    return  expirationSoonList;
    }
*/

}
