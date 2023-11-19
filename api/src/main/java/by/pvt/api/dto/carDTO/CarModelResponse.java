package by.pvt.api.dto.carDTO;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class CarModelResponse {
    private Long id;
    private String model;
    private Integer year;
}
