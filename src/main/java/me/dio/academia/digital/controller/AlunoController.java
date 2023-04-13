package me.dio.academia.digital.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;

import java.util.List;

@Api(value = "Aluno API Interface")
public interface AlunoController {

    @ApiOperation(value = "Recupera todos os alunos")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Alunos Recuperados com Sucesso"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    List<Aluno> getAll(String dataNascimento);

    @ApiOperation(value = "Cria um aluno")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Aluno criado com sucesso"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    Aluno create(AlunoForm form);


    @ApiOperation(value = "Recupera as avaliacoes fisicas por aluno ")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Avaliacoes fisicas do aluno recuperadas com sucesso."),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);

    @ApiOperation(value = "Remove um aluno")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Aluno Removido com Sucesso"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    void delete(Long id);

    @ApiOperation(value = "Atualiza um aluno")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Aluno Atualizado com Sucesso"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    Aluno update(Long id, AlunoUpdateForm form);

    @ApiOperation(value = "Recupera um aluno")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Aluno recuperado com sucesso"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    Aluno get(Long id);
}
