package com.lv.jobsposting.controller;

import com.lv.jobsposting.model.Post;
import com.lv.jobsposting.repository.PostRepository;
import com.lv.jobsposting.repository.SearchRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {
    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @GetMapping("/public/allposts")
    @CrossOrigin
    public List<Post> getAllPosts()
    {
        return repo.findAll();
    }
    // posts/java
    @GetMapping("/public/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text)
    {
        return srepo.findByText(text);
    }

    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post)
    {
        return repo.save(post);
    }
}
