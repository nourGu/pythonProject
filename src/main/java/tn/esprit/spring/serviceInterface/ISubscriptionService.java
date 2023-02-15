package tn.esprit.spring.serviceInterface;

import tn.esprit.spring.entities.Subscription;

import java.util.List;

public interface ISubscriptionService {

    public Subscription addSubscription(Subscription etd);
    public List<Subscription> getAllSubscriptions();

    public String deletetSubscription(Long id);


}
