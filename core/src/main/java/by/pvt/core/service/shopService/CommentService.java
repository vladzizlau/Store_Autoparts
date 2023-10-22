package by.pvt.core.service.shopService;

import by.pvt.api.dto.shopDTO.CommentRequest;
import by.pvt.api.dto.shopDTO.CommentResponse;
import by.pvt.core.convert.CommentConverter;
import by.pvt.core.domain.Comments;
import by.pvt.core.mapper.CommentMapper;
import by.pvt.core.repository.CommentRepository;
import by.pvt.core.service.interfaceService.IComment;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentService implements IComment {
    private final CommentRepository commentRepository;
    private CommentMapper commentMapper;

    public CommentService(CommentRepository cr) {
        commentRepository = cr;

    }

    @Override
    public void addcomment(CommentRequest comm)
    {
        commentRepository.addcomment(commentMapper.toEntity(comm));
    }

    @Override
    public List<CommentResponse> getAllComment()
    {
        return commentRepository.getAllComment();
    }

    @Override
    public CommentResponse findById(Long commID)
    {
        return commentRepository.findById(commID);   }

    @Override
    public void delComment(long id) {
        commentRepository.delComment(id);
    }

    @Override
    public void editComment(CommentRequest req) {
        Comments comment = commentMapper.toEntity(req);
        comment.setDateComment(req.getDateComment());
        comment.setText(req.getText());

        commentRepository.updateComment(comment);
    }
}
