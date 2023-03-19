package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class AcceptOrdered extends AbstractEvent {

    private Long id;

    public AcceptOrdered(Store aggregate){
        super(aggregate);
    }
    public AcceptOrdered(){
        super();
    }
}
