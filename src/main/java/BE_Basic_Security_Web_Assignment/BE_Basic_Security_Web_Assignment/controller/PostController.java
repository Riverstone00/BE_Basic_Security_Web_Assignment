package BE_Basic_Security_Web_Assignment.BE_Basic_Security_Web_Assignment.controller;

import BE_Basic_Security_Web_Assignment.BE_Basic_Security_Web_Assignment.entity.Post;
import BE_Basic_Security_Web_Assignment.BE_Basic_Security_Web_Assignment.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("posts", postService.findAll());
        return "list";
    }

    @GetMapping("/post/{id}")
    public String detail(@PathVariable Long id, Model model) {
        model.addAttribute("post", postService.findById(id));
        return "detail";
    }

    @GetMapping("/post/new")
    public String createForm(Model model) {
        model.addAttribute("post", new Post());
        return "form";
    }

    @PostMapping("/post")
    public String create(Post post) {
        postService.save(post);
        return "redirect:/";
    }

    @GetMapping("/post/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("post", postService.findById(id));
        return "form";
    }
    @PostMapping("/post/edit")
    public String edit(Post post) {
        postService.save(post);
        return "redirect:/";
    }

    @GetMapping("/post/delete/{id}")
    public String delete(@PathVariable Long id) {
        postService.deleteById(id);
        return "redirect:/";
    }
}

