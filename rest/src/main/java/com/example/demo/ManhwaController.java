package com.example.demo;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/manhwa") 
@CrossOrigin(origins = "*")
public class ManhwaController {
    @Autowired
    private ManhwaRepository repository; //O ManhwaRepository é uma interface que extende JpaRepository 
 
    //(GET /manhwa)
    @GetMapping
    public List<Manhwa> getAll() {
        return repository.findAll();
    }
 
    //(GET /manhwa/{id})
    @GetMapping("/{id}")
    public ResponseEntity<Manhwa> getById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
 
    //(POST /manhwa)
    @PostMapping
    public Manhwa create(@RequestBody Manhwa manhwa) {
        return repository.save(manhwa);
    }
 
    //(DELETE /manhwa/{id})
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
 
     
    /*Esses métodos são herdados do jpa:  
        findAll()	          Retorna todos os registros da tabela
        findById(Long id)	  Busca um registro pelo ID
        save(T entidade)	  Cria ou atualiza um registro
        deleteById(Long id)	  Deleta um registro pelo ID
        existsById(Long id)   Verifica se existe registro com aquele ID
        count()	              Retorna o número total de registros 
    */
}
