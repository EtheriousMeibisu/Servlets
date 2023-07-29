package netology.repository;

import netology.exception.NotFoundException;
import netology.model.Post;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public interface PostRepository {
    List<Post> all();
    Optional<Post> getById(long id);
    Post save(Post post);
    void removeById(long id);
}
