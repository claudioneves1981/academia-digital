package me.dio.academia.digital.controller.impl;


import me.dio.academia.digital.controller.MatriculaController;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaControllerImpl implements MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping
    @Override
    public Matricula create(@Valid @RequestBody MatriculaForm form){
        return service.create(form);
    }

    @GetMapping
    @Override
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro){
        return service.getAll(bairro);

    }

    @GetMapping("/{id}")
    @Override
    public Matricula get(@PathVariable Long id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
