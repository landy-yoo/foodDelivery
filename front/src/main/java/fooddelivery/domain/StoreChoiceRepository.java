package fooddelivery.domain;

import fooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="storeChoices", path="storeChoices")
public interface StoreChoiceRepository extends PagingAndSortingRepository<StoreChoice, Long>{

}
