package com.lv.jobsposting.repository;

import com.lv.jobsposting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
