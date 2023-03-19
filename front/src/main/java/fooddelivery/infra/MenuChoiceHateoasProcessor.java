package fooddelivery.infra;
import fooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class MenuChoiceHateoasProcessor implements RepresentationModelProcessor<EntityModel<MenuChoice>>  {

    @Override
    public EntityModel<MenuChoice> process(EntityModel<MenuChoice> model) {

        
        return model;
    }
    
}
