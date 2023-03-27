package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
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
}
