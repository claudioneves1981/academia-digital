package me.dio.academia.digital.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;

import java.util.List;

@Api(value = "Matricula API Interface")
public interface MatriculaController {

    @ApiOperation(value = "Cria uma Matricula")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Matricula Criada com sucesso"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    Matricula create(MatriculaForm form);

    @ApiOperation(value = "Recupera todas as Matriculas")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Matriculas Recuperadas com sucesso"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    List<Matricula> getAll(String bairro);

    @ApiOperation(value = "Recupera uma Matricula")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Matricula recuperada com sucesso"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    Matricula get(Long id);

    @ApiOperation(value = "Remove uma Matricula")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Avaliacao Fisica Removida com sucesso"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    void delete(Long id);
}
