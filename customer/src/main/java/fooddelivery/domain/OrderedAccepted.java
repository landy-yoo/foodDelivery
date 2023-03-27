package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class OrderedAccepted extends AbstractEvent {

    private Long id;
    private String menuId;
    private String menuPrice;
    private String customerId;
    private Date payDate;
    private String customerName;
    private String customerAddress;
    private String customerPhoneNumber;
    private Boolean acceptYN;
    private Date cookStartDT;
    private String payVanNo;
    private String menuName;
}
