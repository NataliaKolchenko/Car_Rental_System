package com.example.CarRentalSystem.service;

import com.example.CarRentalSystem.exception.SubjectAlreadyExistsException;
import com.example.CarRentalSystem.exception.SubjectNotFoundException;
import com.example.CarRentalSystem.exception.error.ErrorMessage;
import com.example.CarRentalSystem.model.Address;
import com.example.CarRentalSystem.repository.JpaAddressRepository;
import com.example.CarRentalSystem.service.interfaces.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.Optional;

@Service
@Validated
public class AddressServiceImp  implements AddressService {
    private final JpaAddressRepository addressRepository;

    @Autowired
    public AddressServiceImp(JpaAddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address create(Address address) {
        Address checkExistAddress = addressRepository.findByCountryAndCityAndStreetAndHouseAndApartment(address.getCountry(),
                address.getCity(), address.getStreet(), address.getHouse(), address.getApartment());
        if(checkExistAddress != null){
            throw new SubjectAlreadyExistsException(ErrorMessage.ADDRESS_IS_ALREADY_EXIST);
        }

//  !!!добавить проброс UserId
        Address newAddress = Address.builder()
                .zipCode(address.getZipCode())
                .country(address.getCountry())
                .region(address.getRegion())
                .city(address.getCity())
                .district(address.getDistrict())
                .street(address.getStreet())
                .house(address.getHouse())
                .apartment(address.getApartment())
                .additionalInfo(address.getAdditionalInfo())
                .updateDate(address.getUpdateDate())
                .editorUserId(address.getEditorUserId())
                .build();
        addressRepository.save(newAddress);
        return newAddress;
    }

    @Override
    public Address update(Long id, Address newAddress) {
        Address address = getById(id);

        Address updatedAddress = Address.builder()
                .zipCode(newAddress.getZipCode())
                .country(newAddress.getCountry())
                .region(newAddress.getRegion())
                .city(newAddress.getCity())
                .district(newAddress.getDistrict())
                .street(newAddress.getStreet())
                .house(newAddress.getHouse())
                .apartment(newAddress.getApartment())
                .additionalInfo(newAddress.getAdditionalInfo())
                .updateDate(newAddress.getUpdateDate())
                .editorUserId(newAddress.getEditorUserId())
                .build();
        addressRepository.save(newAddress);
        return updatedAddress;
    }

    @Override
    public Address getById(Long id) {
        Optional<Address> addressOpt = addressRepository.findById(id);
        Address address = addressOpt.orElseThrow(() -> new SubjectNotFoundException(ErrorMessage.ADDRESS_ID_WAS_NOT_FOUND));
        return address;
    }
}
