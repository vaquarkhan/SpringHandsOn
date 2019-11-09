package sc.cirbuit.br.server.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/services/sc/circuit/br/server/todo")
public class ToDoController {

    private static List<String> latestToDos = new ArrayList<>();

    static {
        latestToDos.add("TO DO 1");
        latestToDos.add("TO DO 2");
        latestToDos.add("TO DO 3");
        latestToDos.add("TO DO 4");
        latestToDos.add("TO DO 5");
    }

    @RequestMapping(path = "latest")
    public List<String> getLatestToDos() {
        return latestToDos;
    }


}
