package captain.avengersproject.sample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public ResponseEntity hello() {
        Map<String, Integer> body = new HashMap<>();
        body.put("1", 1);
        body.put("2", 2);
        body.put("3", 3);
        body.put("4", 4);

        return ResponseEntity.ok(body.getOrDefault("1", 1));
    }
}
