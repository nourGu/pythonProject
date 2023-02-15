package tn.esprit.spring.controllers;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.Subscription;
import tn.esprit.spring.service.SubscriptionService;

import java.util.List;

@RestController
@Api(tags = "subscription")
@RequestMapping("/subscription")
public class SubscriptionRestController {

    @Autowired
    SubscriptionService subscriptionService;

///////// ADD SUBSCRIPTION ///////////////////
    @ApiOperation(value = "Récupérer la liste des examens")
    @PostMapping("/add/subscription")
    @ResponseBody
    public Subscription addSubscrition(@RequestBody Subscription sub) {
        Subscription subscription= subscriptionService.addSubscription(sub);
        return subscription;
    }

//////// GET ALL SUBSCRIPTIONS ///////////////////
    @ApiOperation(value = "Récupérer la liste des examens")
    @GetMapping("/retrieve/allSubscriptions")
    @ResponseBody
    public List<Subscription> getSubscriptions() {
        return subscriptionService.getAllSubscriptions();
    }

//////// DELETE SUBSCRIPTION ///////////////////

    @ApiOperation(value = "Récupérer la liste des examens")
    @DeleteMapping("/delete/subscription/{id}")
    public String deleteSubscription(@PathVariable("id") Long id) {
        return subscriptionService.deletetSubscription(id);
    }


//////// ASSIGN SUB TO OFFER  ///////////////////
    @PutMapping("/addSubToOffer/{SubId}/{offerId}")
    public void addEtudiantDept(@PathVariable("SubId") long SubId, @PathVariable("offerId") long offerId) {
        subscriptionService.assignSubscriptionToOffer(SubId,offerId);

    }



}
