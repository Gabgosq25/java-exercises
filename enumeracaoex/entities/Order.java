package entities;

import java.util.Date;
import entities.enums.OrderStatus;

public class Order {

    private Integer id;
    private OrderStatus status;
    private Date moment;

    public Order() {
    }

    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.status = status;
        this.moment = moment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", status=" + status + ", moment=" + moment + "]";
    }

}
