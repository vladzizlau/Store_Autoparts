package by.pvt.core.error;

import by.pvt.api.dto.shopDTO.ErrorResponseDTO;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
//Класс обработчик ошибок

@ControllerAdvice
@Slf4j
public class Handler {
    @ResponseBody
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ErrorResponseDTO notValidated(MethodArgumentNotValidException e){
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
        errorResponseDTO.setMessage(e.getAllErrors().get(0).getDefaultMessage());
        errorResponseDTO.setStatus("Не правильно введены данные");
        log.error("Error : " + e.getMessage());
        return errorResponseDTO;
    }

}
