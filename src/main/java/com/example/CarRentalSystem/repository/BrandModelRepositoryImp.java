package com.example.CarRentalSystem.repository;

import com.example.CarRentalSystem.model.Brand;
import com.example.CarRentalSystem.repository.interfaces.BrandModelRepositoryInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BrandModelRepositoryImp implements BrandModelRepositoryInterface {
    @Override
    public Brand createVehicleBrand(String brandName) {
        return null;
    }

    @Override
    public Brand updateVehicleBrand(Long brandId, String newBrandName) {
        return null;
    }

    @Override
    public boolean deleteVehicleBrandById(Long brandId) {
        return false;
    }

    @Override
    public Brand getVehicleVehicleBrandById(Long brandId) {
        return null;
    }

    @Override
    public List<Brand> getAllVehicleBrand() {
        return null;
    }
}
