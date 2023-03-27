package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookingStatus extends AbstractEvent {

    private Long id;
    private String menuId;
    private String customerId;
    private Date payDate;
    private String customerName;
    private Boolean acceptYn;
    private Date cookStartDate;
    private String payVanNo;
    private String menuName;
    private Date cancleOrderDate;
    private Date cookFinishDate;
    private String status;

    public CookingStatus(Store aggregate) {
        super(aggregate);
    }

    public CookingStatus() {
        super();
    }
}
