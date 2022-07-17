package com.codegus.codegus.services.addresses.touristplace;

import com.codegus.codegus.dtos.address.AddressDto;
import com.codegus.codegus.dtos.address.AddressItem;
import com.codegus.codegus.dtos.address.AddressRequest;
import com.codegus.codegus.mappers.address.TouristPlaceAddressMapper;
import com.codegus.codegus.models.apply.address.TouristPlaceAddress;
import com.codegus.codegus.repositories.apply.address.TouristPlaceAddressRepository;
import com.codegus.codegus.services.BaseServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TouristPlaceTouristPlaceAddressServiceImp extends BaseServiceImpl
        <TouristPlaceAddress, UUID, AddressItem, AddressDto,
                AddressRequest, TouristPlaceAddressRepository, TouristPlaceAddressMapper>
        implements TouristPlaceAddressService {

    @Override
    public List<AddressDto> findByTouristPlaceId(UUID touristPlaceId) {
        List<TouristPlaceAddress> list = repository.findByTouristPlaceId(touristPlaceId);
        return list.stream().map(item -> mapper.entityToDto(item)).collect(Collectors.toList());
    }

}
