package by.pvt.core.service.shopService;

import by.pvt.api.dto.shopDTO.CommentRequest;
import by.pvt.api.dto.shopDTO.CommentResponse;
import by.pvt.core.domain.Comments;
import by.pvt.core.mapper.CommentMapper;
import by.pvt.core.repository.CommentRepo;
import by.pvt.core.service.interfaceService.IComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService implements IComment
    {
    private CommentRepo commentRepository;
    private CommentMapper commentMapper;

    @Autowired
    public CommentService(CommentRepo commentRepository, CommentMapper commentMapper)
        {
        this.commentRepository = commentRepository;
        this.commentMapper = commentMapper;
        }


    @Override
    public void addcomment(CommentRequest comm)
        {
        commentRepository.save(commentMapper.toEntity(comm));
        }

    @Override
    public List<CommentResponse> getAllComment()
        {
        return commentMapper.toResponseList(commentRepository.findAll());
        }

    @Override
    public CommentResponse findById(Long commID)
        {
        Optional<Comments> byId = commentRepository.findById(commID);
        return commentMapper.toResponse(byId.get());
        }

    @Override
    public void delComment(long id)
        {
        commentRepository.deleteById(id);
        }

    @Override
    public void editComment(CommentRequest req)
        {
        commentRepository.save(commentMapper.toEntity(req));
        }
    }
