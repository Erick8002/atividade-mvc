package ProjetoBiblioteca.biblioteca.controller;

import ProjetoBiblioteca.biblioteca.model.Livro;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/livros")
public class LivroController {

    // Responde a: GET /livros
    @GetMapping
    public String inicio() {
        return "livros/inicio";
    }

    // Responde a: GET /livros/detalhes
    @GetMapping("/detalhes")
    public String exibirLivro(Model model) {
        Livro livro = new Livro();
        livro.setTitulo("Dom Casmurro");
        livro.setAutor("Machado de Assis");
        livro.setIsbn("978-85-00-00000-0");

        model.addAttribute("livro", livro);

        return "livros/detalhes"; // Ajustado para a pasta livros/detalhes.html
    }
}