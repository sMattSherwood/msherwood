package part1.msherwood.services;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    
    public String sayHello(String name)
    {
        return "Hello " + name;
    
    }

    public String sayGoodbye(String name)
    {
        return "Goodbye " + name;
    }
}
