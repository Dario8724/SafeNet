package pt.app.JusticeLeague.service;

import pt.app.JusticeLeague.dto.response.TipoDenunciaDTO;
import pt.app.JusticeLeague.model.TipoDenuncia;
import pt.app.JusticeLeague.repository.TipoDenunciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TipoDenunciaService {

    @Autowired
    private TipoDenunciaRepository tipoDenunciaRepository;

    public List<TipoDenunciaDTO> listarTodos() {
        return tipoDenunciaRepository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    private TipoDenunciaDTO toDTO(TipoDenuncia t) {
        return TipoDenunciaDTO.builder()
                .id(t.getId())
                .nome(t.getNome())
                .descricao(t.getDescricao())
                .build();
    }
}
