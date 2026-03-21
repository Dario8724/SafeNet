package pt.app.JusticeLeague.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoDenunciaDTO {
    private Long id;
    private String nome;
    private String descricao;
}
