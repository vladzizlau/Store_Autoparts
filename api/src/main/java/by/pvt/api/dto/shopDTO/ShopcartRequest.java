package by.pvt.api.dto.shopDTO;


import lombok.Data;

@Data

public class ShopcartRequest {
    long id;
    long orderid;
    String status;
    double cost;


}
