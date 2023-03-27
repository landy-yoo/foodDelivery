package fooddelivery.domain;

import fooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "payInfos", path = "payInfos")
public interface PayInfoRepository
    extends PagingAndSortingRepository<PayInfo, Long> {}
