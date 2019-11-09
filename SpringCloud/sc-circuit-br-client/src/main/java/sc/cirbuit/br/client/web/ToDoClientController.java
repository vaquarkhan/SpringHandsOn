package sc.cirbuit.br.client.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(path = "/api/services/sc/circuit/br/client/todo")
public class ToDoClientController {

    @Value("${sc.circuit.br.server.todo.latest.url}")
    private String circuitBrServerToDoLatestUrl;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(path = "show-latest")
    //@HystrixCommand(fallbackMethod = "reliable")
    public List<String> showLatestToDos() {

        URI uri = URI.create(circuitBrServerToDoLatestUrl);

        return this.restTemplate.getForObject(uri, List.class);
    }

    public List<String> reliable() {
        return Collections.emptyList();
    }
}
