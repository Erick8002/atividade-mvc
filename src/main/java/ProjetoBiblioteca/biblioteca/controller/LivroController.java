package ProjetoBiblioteca.biblioteca.controller;

import ProjetoBiblioteca.biblioteca.model.Autor;
import ProjetoBiblioteca.biblioteca.model.Livro;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivroController {

    private List<Livro> livros = new ArrayList<>();

    // Responde a: GET /livros
    @GetMapping
    public String inicio(Model model) {
        model.addAttribute("livro", new Livro());
        model.addAttribute("livros", livros);
        return "livros/inicio";
    }

    // Responde a: GET /livros/detalhes
    @GetMapping("/detalhes")
    public String exibirLivro(Model model) {
        Livro livro = new Livro();
        Autor autor = new Autor();
        autor.setNome("Machado de Assis");
        autor.setNacionalidade("Brasileiro");
        autor.setObrasPublicadas(15);
        livro.setTitulo("Dom Casmurro");
        livro.setAutor(autor);
        livro.setIsbn("978-85-00-00000-0");

        model.addAttribute("livro", livro);

        return "livros/detalhes"; // Ajustado para a pasta livros/detalhes.html
    }

    @PostMapping
    public String cadastrarLivros(@ModelAttribute Livro livro){
        livros.add(livro);
        return "redirect:/livros";
    }

    @DeleteMapping("/excluir/{indice}")
    public String excluir(@PathVariable int indice){
        if (indice >= 0 && indice < livros.size()) {
            livros.remove(indice);
        }
        return "redirect:/livros";
    }
}