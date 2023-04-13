package me.dio.academia.digital.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;
@Api(value = "Avaliação Fisica API Interface")
public interface AvaliacaoFisicaController {

    @ApiOperation(value = "Cria uma Avaliacao Fisica")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Avaliacao Fisica Criada com sucesso"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    @ApiOperation(value = "Recupera uma Avaliação Fisica")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Avaliação Fisica Recuperada com sucesso"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    AvaliacaoFisica get(Long id);

    @ApiOperation(value = "Recupera todas as avaliações fisicas")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Avaliações Fisicas recuperadas com Sucesso"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    List<AvaliacaoFisica> getAll();

    @ApiOperation(value = "Atualiza Avaliaçao Fisica")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Avaliaçao Fisica Atualizado com Sucesso"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    @ApiOperation(value = "Remove Avaliaçao Fisica")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Avaliaçao Fisica Removida Com sucesso"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    void delete(Long id);
}
