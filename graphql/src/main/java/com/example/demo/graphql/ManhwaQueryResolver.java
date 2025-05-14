package com.example.demo.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.demo.Manhwa;
import com.example.demo.ManhwaRepository;

@Controller
public class ManhwaQueryResolver {

    @Autowired
    private ManhwaRepository repository;

    @QueryMapping
    public List<Manhwa> manhwas() {
        return repository.findAll();
    }

    @QueryMapping
    public Manhwa manhwa(@Argument Long id) {
        return repository.findById(id).orElse(null);
    }
}
