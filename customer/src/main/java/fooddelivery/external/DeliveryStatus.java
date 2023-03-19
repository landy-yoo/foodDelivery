package fooddelivery.external;

import lombok.Data;
import java.util.Date;
@Data
public class DeliveryStatus {

    private Long id;
    private String customerId;
    private String customerName;
    private String storeId;
    private String storeName;
    private String menuId;
    private String menuName;
    private String menuPirce;
    private Boolean startCookYn;
    private Boolean payCancelYn;
    private Boolean orderCancelYn;
    private Boolean deliveryYn;
    private Date orderDt;
    private Date payDt;
    private String payAcceptId;
    private Date startCookDt;
    private Date startDeliveryDt;
    private Date orderCancelDt;
    private Date orderToStoreDt;
    private Date acceptOrderDt;
    private Date cancelStoreDt;
    private String payVanNo;
}


