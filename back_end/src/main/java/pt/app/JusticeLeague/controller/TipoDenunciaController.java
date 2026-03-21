package pt.app.JusticeLeague.controller;

import pt.app.JusticeLeague.dto.response.TipoDenunciaDTO;
import pt.app.JusticeLeague.service.TipoDenunciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-denuncia")
public class TipoDenunciaController {

    @Autowired
    private TipoDenunciaService tipoDenunciaService;

    @GetMapping
    public ResponseEntity<List<TipoDenunciaDTO>> listarTodos() {
        return ResponseEntity.ok(tipoDenunciaService.listarTodos());
    }
}
