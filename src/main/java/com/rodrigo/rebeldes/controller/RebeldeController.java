package com.rodrigo.rebeldes.controller;


import com.rodrigo.rebeldes.model.RebeldeDTO;
import com.rodrigo.rebeldes.services.RebeldeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping(value = "/rebelde")
public class RebeldeController {

    private RebeldeService rebeldeService;


    @GetMapping("/listar-rebeldes")
    private ResponseEntity<String> getAll() {
        List<RebeldeDTO> response = rebeldeService.getListaRebeldes();

        return new ResponseEntity<>("Lista de Rebeldes: " + response, HttpStatus.OK);
    }


    @PostMapping("/add-rebelde")
    private ResponseEntity<String> addRebelde(@RequestBody RebeldeDTO rebeldeDTO) {
        rebeldeService.addRebelde(rebeldeDTO);

        return new ResponseEntity<>("Rebelde adicionado com sucesso!", HttpStatus.OK);
    }


    @PutMapping("/update-rebelde/{id}")
    private ResponseEntity<String> updateRebelde(@PathVariable Integer id, @RequestBody RebeldeDTO rebeldeDTO) {
        rebeldeService.updateRebelde(id, rebeldeDTO);

        return new ResponseEntity<>("Rebelde alterado com sucesso!", HttpStatus.OK);
    }


    @DeleteMapping("/delete-rebelde/{id}")
    private ResponseEntity<String> deleteRebelde(@PathVariable Integer id) {
        rebeldeService.deleteRebelde(id);

        return new ResponseEntity<>("Rebelde excluído da lista com sucesso!", HttpStatus.OK);
    }
}
