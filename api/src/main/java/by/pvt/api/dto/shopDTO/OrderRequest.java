package by.pvt.api.dto.shopDTO;


import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;

@Data
public class OrderRequest {

    @NotBlank (message = "[OrderRequest]: Не правильно заполнили поле ")
    private String status;
    @NotNull
    private Double cost;
    @NotNull
    @Positive
    private Long userid;


}
