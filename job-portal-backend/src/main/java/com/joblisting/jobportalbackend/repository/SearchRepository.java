package com.joblisting.jobportalbackend.repository;

import com.joblisting.jobportalbackend.model.Post;

import java.util.List;

public interface SearchRepository{
    List<Post> fingByText(String text);
}
