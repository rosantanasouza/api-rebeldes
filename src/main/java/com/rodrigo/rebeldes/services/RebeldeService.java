package com.rodrigo.rebeldes.services;

import com.rodrigo.rebeldes.model.RebeldeDTO;
import com.rodrigo.rebeldes.repository.RebeldeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RebeldeService {

    private RebeldeRepository rebeldeRepository;


    public List<RebeldeDTO> getListaRebeldes() {
        return this.rebeldeRepository.getListaRebeldes();
    }


    public void addRebelde(RebeldeDTO rebeldeDTO) {
        this.rebeldeRepository.addRebelde(rebeldeDTO);
    }


    public void updateRebelde(Integer id, RebeldeDTO rebeldeDTO) {
        rebeldeRepository.updateRebelde(id, rebeldeDTO);
    }

    public void deleteRebelde(Integer id) {
        rebeldeRepository.deleteRebelde(id);
    }
}
