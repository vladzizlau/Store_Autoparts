package by.pvt.core.mapper;

import by.pvt.api.dto.shopDTO.CommentRequest;
import by.pvt.api.dto.shopDTO.CommentResponse;
import by.pvt.core.domain.Comments;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommentMapper
    {
    CommentResponse toResponse(Comments comments);

    @Mapping(target = "id", ignore = true)
    Comments toEntity(CommentRequest request);

    List<CommentResponse> toResponseList(List<Comments> commentsList);
    }
