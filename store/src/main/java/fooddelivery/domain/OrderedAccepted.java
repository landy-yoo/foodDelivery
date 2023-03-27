package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderedAccepted extends AbstractEvent {

    private Long id;
    private String menuId;
    private String menuPrice;
    private String customerId;
    private Date payDate;
    private String customerName;
    private String customerAddress;
    private String customerPhoneNumber;
    private Boolean acceptYn;
    private Date cookStartDt;
    private String payVanNo;
    private String menuName;

    public OrderedAccepted(Store aggregate) {
        super(aggregate);
    }

    public OrderedAccepted() {
        super();
    }
}
