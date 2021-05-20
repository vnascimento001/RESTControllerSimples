package rest.simples;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class LivroController {
    @GetMapping("/livros")
        public List<Livro> getAllLivros() {
            return Arrays.asList(new Livro(1, "LivroTeste", "AutorTeste"));
        }
}