package com.joblisting.jobportalbackend.controller;

import com.joblisting.jobportalbackend.repository.PostRepository;
import com.joblisting.jobportalbackend.model.Post;
import com.joblisting.jobportalbackend.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private SearchRepository searchRepository;

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post) {
        return postRepository.save(post);
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text) {
        return searchRepository.fingByText(text);
    }
}
