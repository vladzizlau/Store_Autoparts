package by.pvt.api.dto.shopDTO;


import lombok.Data;

@Data

public class OrderRequest {
    long id;
    long productid;
    long userid;
    double cost;
    int count;


}
