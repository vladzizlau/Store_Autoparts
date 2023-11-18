package by.pvt.api.dto.shopDTO;


import jakarta.validation.constraints.*;
import lombok.Data;


import java.awt.desktop.UserSessionEvent;
import java.math.BigDecimal;

@Data
public class ShopcartRequest {

    @NotNull
    @Positive(message = "[ShopcartRequest][cost]: Вы ввели отрицательное значение")
    private BigDecimal cost;
    @NotNull
    @Positive(message = "[ShopcartRequest][count]: Вы ввели отрицательное значение")
    private Integer count;
    @NotNull
    @Positive
    private Long product;
    @Positive(message = "[ShopcartRequest][user]: Не правильно заполнили поле user")
    private Long user;


}
