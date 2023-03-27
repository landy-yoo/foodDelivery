package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderChoosed extends AbstractEvent {

    private Long id;
    private String menuId;
    private String menuName;
    private String menuPrice;
    private String customerId;
    private String customerName;
    private String customerAddress;
    private String customerPhoneNumber;
    private Date orderDate;
    private Integer qty;
    private String status;

    public OrderChoosed(Order aggregate) {
        super(aggregate);
    }

    public OrderChoosed() {
        super();
    }
}