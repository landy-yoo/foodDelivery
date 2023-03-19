package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class RejectOrdered extends AbstractEvent {

    private Long id;

    public RejectOrdered(Store aggregate){
        super(aggregate);
    }
    public RejectOrdered(){
        super();
    }
}
