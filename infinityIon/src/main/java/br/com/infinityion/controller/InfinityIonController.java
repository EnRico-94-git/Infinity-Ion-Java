package br.com.infinityion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.infinityion.model.Cliente;
import br.com.infinityion.model.Residencia;
import br.com.infinityion.model.Usuario;
import br.com.infinityion.repository.ClienteRepository;
import br.com.infinityion.repository.ResidenciaRepository;
import br.com.infinityion.repository.SolucaoRepository;
import br.com.infinityion.repository.UsuarioRepository;

@Controller
public class InfinityIonController {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ResidenciaRepository residenciaRepository;

    @Autowired
    private SolucaoRepository solucaoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Páginas de ChatGPT
    @GetMapping("/form_chatgpt")
    public String retornaFormChatGPT() {
        return "form_chatgpt";
    }

    @PostMapping("/enviar_chat_gpt")
    public String enviarPerguntaChatGPT(@RequestParam(name = "pergunta") String pergunta, Model model) {
        String resposta = "Simulated response from ChatGPT for: " + pergunta; // Simulação de resposta
        model.addAttribute("resposta", resposta);
        return "resposta_chatgpt";
    }

    // Páginas de login e home
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/index")
    public String retornaPagina() {
        return "index";
    }

    // Clientes
    @GetMapping("/cliente")
    public ModelAndView listarClientes() {
        ModelAndView mv = new ModelAndView("cliente");
        mv.addObject("clientes", clienteRepository.findAll());
        return mv;
    }

    @GetMapping("/cadastra_cliente")
    public ModelAndView novoClienteForm() {
        ModelAndView mv = new ModelAndView("cadastra_cliente");
        mv.addObject("cliente", new Cliente());
        return mv;
    }

    @PostMapping("/cliente")
    public ModelAndView salvarCliente(@Validated Cliente cliente, BindingResult result) {
        if (result.hasErrors()) {
            ModelAndView mv = new ModelAndView("cadastra_cliente");
            mv.addObject("cliente", cliente);
            return mv;
        }
        clienteRepository.save(cliente);
        return new ModelAndView("redirect:/clientes");
    }

    // Residencias
    @GetMapping("/residencia")
    public ModelAndView listarResidencias() {
        ModelAndView mv = new ModelAndView("residencia");
        mv.addObject("residencias", residenciaRepository.findAll());
        return mv;
    }

    @GetMapping("/cadastra_residencia")
    public ModelAndView novaResidenciaForm() {
        ModelAndView mv = new ModelAndView("cadastra_residencia");
        mv.addObject("residencia", new Residencia());
        return mv;
    }

    @PostMapping("/residencias")
    public ModelAndView salvarResidencia(@Validated Residencia residencia, BindingResult result) {
        if (result.hasErrors()) {
            ModelAndView mv = new ModelAndView("cadastra_residencia");
            mv.addObject("residencia", residencia);
            return mv;
        }
        residenciaRepository.save(residencia);
        return new ModelAndView("redirect:/residencias");
    }

    // Soluções
    @GetMapping("/solucoes")
    public ModelAndView listarSolucoes() {
        ModelAndView mv = new ModelAndView("solucao");
        mv.addObject("solucoes", solucaoRepository.findAll());
        return mv;
    }

    // Usuário
    @GetMapping("/novo_usuario")
    public ModelAndView retornaCadUsuario() {
        ModelAndView mv = new ModelAndView("novo_usuario");
        mv.addObject("usuario", new Usuario());
        return mv;
    }

    @PostMapping("/inserir_usuario")
    public ModelAndView cadastrarUsuario(@Validated Usuario usuario, BindingResult result) {
        if (result.hasErrors()) {
            ModelAndView mv = new ModelAndView("novo_usuario");
            mv.addObject("usuario", usuario);
            return mv;
        }

        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        usuarioRepository.save(usuario);
        return new ModelAndView("redirect:/");
    }

    @GetMapping("/acesso_negado")
    public String acessoNegado() {
        return "acesso_negado";
    }
}
