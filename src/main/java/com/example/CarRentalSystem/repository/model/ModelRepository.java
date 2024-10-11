package com.example.CarRentalSystem.repository.model;

import com.example.CarRentalSystem.model.Brand;
import com.example.CarRentalSystem.model.Model;

import java.util.List;
import java.util.Optional;

public interface ModelRepository {
    Model createModel (Model newModel);
    Brand updateModel (Model updatedModel);
    boolean deleteModelById(Long modelId);
    Optional<Model> getModelById(Long modelId);
    Model getModelByName(String modelName);
    List<Model> getAllModels();
}
