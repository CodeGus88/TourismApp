package com.codegus.codegus.services.addresses.touristplace;

import com.codegus.codegus.dtos.address.AddressDto;
import com.codegus.codegus.dtos.address.AddressItem;
import com.codegus.codegus.dtos.address.AddressRequest;
import com.codegus.codegus.models.apply.address.TouristPlaceAddress;
import com.codegus.codegus.services.BaseService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;


@Service
public interface TouristPlaceAddressService extends BaseService<TouristPlaceAddress, UUID, AddressItem, AddressDto, AddressRequest> {

    List<AddressDto> findByTouristPlaceId(UUID touristPlaceId);

}
