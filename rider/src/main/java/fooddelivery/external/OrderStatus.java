package fooddelivery.external;

import lombok.Data;
import java.util.Date;
@Data
public class OrderStatus {

    private Long id;
    private String customerId;
    private String customerName;
    private String storeId;
    private String storeName;
    private String menuId;
    private String menuName;
    private String menuPrice;
    private Date orderDt;
    private Date cancelOrderDt;
    private Date payDt;
    private Date cancelPayDt;
    private Date acceptOrderDt;
    private Date rejectOrderDt;
    private Date startCookDt;
    private Date finishCookDt;
    private String vanAccpteNo;
    private String vanCancelNo;
    private Date riderPickDt;
    private Date finishDeliveryDt;
}


