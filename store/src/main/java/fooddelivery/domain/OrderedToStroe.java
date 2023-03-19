package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderedToStroe extends AbstractEvent {

    private Long id;

    public OrderedToStroe(Store aggregate){
        super(aggregate);
    }
    public OrderedToStroe(){
        super();
    }
}
