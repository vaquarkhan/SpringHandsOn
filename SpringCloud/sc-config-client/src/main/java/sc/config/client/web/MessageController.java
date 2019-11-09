package sc.config.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/spring/cloud/config/client/messages")
public class MessageController {

    @Value("${message:Hello default}")
    private String message;

    @RequestMapping(path = "index")
    public String getMessage() {
        return message;
    }


}
