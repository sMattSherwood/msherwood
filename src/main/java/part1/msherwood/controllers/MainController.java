package part1.msherwood.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import part1.msherwood.services.MessageService;

@Controller
public class MainController {

    // we declare the object Message Services above the two functions so we don't have to create the object in each function
    
    MessageService messageService; //= new MessageService();

    @Autowired
    public MainController(MessageService messageService)
    {
        this.messageService = messageService;
    }    


    @GetMapping("/hello")
    public String sayHello(@RequestParam String who, Model model)
    {
        //MessageService messageService = new MessageService();
        String message = messageService.sayHello(who);
        model.addAttribute("message", message);
        return "message";
    }

    @GetMapping("/goodbye")
    public String sayGoodbye(@RequestParam String who, Model model)
    {
      //  MessageService messageService = new MessageService();
        String message = messageService.sayGoodbye(who);
        model.addAttribute("message", message);
        return "message";
    }
    
}
