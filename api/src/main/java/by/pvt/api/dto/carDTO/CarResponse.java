package by.pvt.api.dto.carDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CarResponse {
    private long id;
    private String brand;



}
