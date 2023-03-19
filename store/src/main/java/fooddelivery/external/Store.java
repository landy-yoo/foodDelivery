package fooddelivery.external;

import java.util.Date;
import lombok.Data;

@Data
public class Store {

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
    private String payVanNo;
}
