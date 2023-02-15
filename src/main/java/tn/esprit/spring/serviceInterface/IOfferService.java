package tn.esprit.spring.serviceInterface;

import tn.esprit.spring.entities.Offer;
import tn.esprit.spring.entities.Subscription;

import java.util.List;

public interface IOfferService {

    public Offer addOffer(Offer offer);
    public List<Offer> getAllOffers();

    public void deletetOffer(Long id);


}
