package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Menuchoosed extends AbstractEvent {

    private Long id;

    public Menuchoosed(MenuChoice aggregate){
        super(aggregate);
    }
    public Menuchoosed(){
        super();
    }
}
