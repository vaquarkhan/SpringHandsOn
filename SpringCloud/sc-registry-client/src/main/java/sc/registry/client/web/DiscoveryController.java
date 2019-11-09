package sc.registry.client.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/services/sc/cloud/registry/client/discovery")
public class DiscoveryController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${server.application.name}")
    private String applicationNameDefault;

    @RequestMapping("service-instances-default")
    public List<ServiceInstance> serviceInstances() {
        return this.discoveryClient.getInstances(applicationNameDefault);
    }

    @RequestMapping("services-list")
    public List<String> services() {
        return this.discoveryClient.getServices();
    }

    @RequestMapping("service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }
}
