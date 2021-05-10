package net.porodnov.bookshop.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name ="eployee_id")
    private Employee employee;

    private LocalDateTime starOfPurchase;

    public OrderEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDateTime getStarOfPurchase() {
        return starOfPurchase;
    }

    public void setStarOfPurchase(LocalDateTime starOfPurchase) {
        this.starOfPurchase = starOfPurchase;
    }

}
