package by.pvt.core.mapper;

import by.pvt.api.dto.shopDTO.CommentRequest;
import by.pvt.api.dto.shopDTO.CommentResponse;
import by.pvt.core.domain.Comments;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    CommentResponse toResponse(Comments comments);
    Comments toEntity(CommentRequest request);
    List<CommentResponse> toResponseList(List<Comments> commentsList);
}
