package BE_Basic_Security_Web_Assignment.BE_Basic_Security_Web_Assignment.service;

import BE_Basic_Security_Web_Assignment.BE_Basic_Security_Web_Assignment.entity.Post;
import BE_Basic_Security_Web_Assignment.BE_Basic_Security_Web_Assignment.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findAll(){
        return postRepository.findAll();
    }

    public Post save(Post post) {
        return postRepository.save(post);
    }

    public Post findById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        Post post = postRepository.findById(id).orElse(null);
    }
}
