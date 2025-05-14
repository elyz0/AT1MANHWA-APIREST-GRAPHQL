package com.example.demo.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import com.example.demo.Manhwa;
import com.example.demo.ManhwaRepository;

@Controller
public class ManhwaMutationResolver {

    @Autowired
    private ManhwaRepository repository;

    @MutationMapping
    public Manhwa criarManhwa(
            @Argument String titulo,
            @Argument String autor,
            @Argument String genero,
            @Argument String status,
            @Argument String descricao,
            @Argument Double nota,
            @Argument String capa) {

        Manhwa manhwa = new Manhwa();
        manhwa.setTitulo(titulo);
        manhwa.setAutor(autor);
        manhwa.setGenero(genero);
        manhwa.setStatus(status);
        manhwa.setDescricao(descricao);
        manhwa.setNota(nota);
        manhwa.setCapa(capa);

        return repository.save(manhwa);
    }

    @MutationMapping
    public Boolean deletarManhwa(@Argument Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
