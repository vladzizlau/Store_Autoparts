package by.pvt.core.repository.interfaceRepository;

import by.pvt.api.dto.carDTO.CarModelResponse;
import by.pvt.api.dto.carDTO.CarResponse;
import by.pvt.core.domain.shopDomain.CarModel;

import java.util.List;

public interface CarModelInterface {

    void addModel(CarModel carModel);

    List<CarModelResponse> getAllModel();

    List<CarModelResponse> getModelByBrand(Long brandId);

    CarModel getModelById(Long modelId);

    void updateModel(CarModel carmodel);

    void deleteModel(Long id);
}
