package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CancelOrdered extends AbstractEvent {

    private Long id;

    public CancelOrdered(Store aggregate){
        super(aggregate);
    }
    public CancelOrdered(){
        super();
    }
}
