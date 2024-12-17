package com.mininsta.mininsta.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return this.postService.getAllPosts();
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return this.postService.createPost(post);
    }

    @DeleteMapping
    public void deletePost(@RequestBody Long id) {
        this.postService.deletePost(id);
    }
}
