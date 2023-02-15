package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Offer;
import tn.esprit.spring.repository.OfferRepository;
import tn.esprit.spring.serviceInterface.IOfferService;

import java.util.List;
@Service
public class OfferService implements IOfferService {
    @Autowired
    OfferRepository offerRepository;


    public Offer addOffer(Offer offer) {
        return offerRepository.save(offer);
    }

    public List<Offer> getAllOffers() {
        return offerRepository.findAll();
    }

    public void deletetOffer(Long id) {
        Offer offer= offerRepository.findById(id).get();
        offerRepository.delete(offer);
    }
}
