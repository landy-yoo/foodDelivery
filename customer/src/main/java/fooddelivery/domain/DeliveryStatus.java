package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryStatus extends AbstractEvent {

    private Long id;
    private String storeId;
    private String menuId;
    private String menuPrice;
    private String customerId;
    private Date payDate;
    private String customerName;
    private String customerAddress;
    private String customerPhoneNumber;
    private Boolean acceptYn;
    private Date cookStartDt;
    private Date payVanNo;
    private String riderInfo;
    private Date pickDt;
    private Date finishCookDt;
    private Date finishDeliveryDt;
}
