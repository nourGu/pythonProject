package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Offer;
import tn.esprit.spring.entities.Subscription;
import tn.esprit.spring.repository.OfferRepository;
import tn.esprit.spring.repository.SubscriptionRepository;
import tn.esprit.spring.serviceInterface.ISubscriptionService;

import java.util.List;

@Service
public class SubscriptionService implements ISubscriptionService {

    @Autowired
    SubscriptionRepository subscriptionRepository;
    @Autowired
    OfferRepository offerRepository;

    public Subscription addSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    public List<Subscription> getAllSubscriptions() {
        return subscriptionRepository.findAll();
    }

    public String deletetSubscription(Long id) {
      Subscription subscription= new Subscription();
      if(subscription == subscriptionRepository.findById(id).get()){

          subscriptionRepository.delete(subscription);
          return "Subscription deleted successfully";

      }
          return "Subscription notFound";
    }


    public void assignSubscriptionToOffer (long subId, long offerId) {
        Subscription subscription = subscriptionRepository.findById(subId).get();
        Offer offer = offerRepository.findById(offerId).get();
        subscription.setOffer(offer);
        subscriptionRepository.save(subscription);

    }
}
