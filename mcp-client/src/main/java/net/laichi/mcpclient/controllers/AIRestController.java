package net.laichi.mcpclient.controllers;

import net.laichi.mcpclient.agents.AIAgent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIRestController {
    private AIAgent agent;

    public AIRestController(AIAgent agent) {
        this.agent = agent;
    }
    @GetMapping("/chat")
    public String chat(String query) {
        return agent.askLLM(query);
    }
}

