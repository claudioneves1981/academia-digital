package me.dio.academia.digital.controller.impl;

import me.dio.academia.digital.controller.AlunoController;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoControllerImpl implements AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    @Override
    public List<Aluno> getAll(@RequestParam(value="dataNascimento", required = false) String dataNascimento){
        return service.getAll(dataNascimento);
    }

    @PostMapping
    @Override
    public Aluno create(@Valid @RequestBody AlunoForm form){
        return service.create(form);
    }

    @GetMapping("avaliacoes/{id}")
    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
        return service.getAllAvaliacaoFisicaId(id);


    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @PutMapping("/{id}")
    @Override
    public Aluno update(@PathVariable Long id, @Valid @RequestBody AlunoUpdateForm form){
        return service.update(id, form);
    }

    @GetMapping("/{id}")
    @Override
    public Aluno get(@PathVariable Long id){
        return service.get(id);
    }

}
