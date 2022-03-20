package com.rodrigo.rebeldes.repository;

import com.rodrigo.rebeldes.model.RebeldeDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Objects;

@Repository
@AllArgsConstructor
public class RebeldeRepository {

    private List<RebeldeDTO> rebeldeDTOList;


    public List<RebeldeDTO> getListaRebeldes() {
        return this.rebeldeDTOList;
    }


    public void addRebelde(RebeldeDTO rebeldeDTONovo) {
        this.rebeldeDTOList.add(rebeldeDTONovo);
    }


    public void updateRebelde(Integer id, RebeldeDTO rebeldeDTO) {
        for (RebeldeDTO rebelde : this.rebeldeDTOList) {
            if (Objects.equals(rebelde.getId(), id)) {
                rebelde.setName(rebeldeDTO.getName());
                rebelde.setAge(rebeldeDTO.getAge());
                rebelde.setGenre(rebeldeDTO.getGenre());
                rebelde.setCurrentLocationDTO(rebeldeDTO.getCurrentLocationDTO());
                rebelde.setInventory(rebeldeDTO.getInventory());
            }
        }
    }


    public void deleteRebelde(Integer id) {
        this.rebeldeDTOList.removeIf(rebelde -> Objects.equals(rebelde.getId(), id));
    }
}
