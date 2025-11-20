package com.prashanth.docker_demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app/v1/docker_demo")
@RequiredArgsConstructor
public class DockerDemoController {

    private final DockerDemoRepository dockerDemoRepository;

    @GetMapping("/get_all")
    public List<DockerDemoEntity> findAll() {
        return dockerDemoRepository.findAll();
    }

    @PostMapping("/save")
    public DockerDemoEntity save(@RequestBody DockerDemoEntity dockerDemoEntity){
        return dockerDemoRepository.save(dockerDemoEntity);
    }

    @GetMapping("/get_by_id")
    public Optional<DockerDemoEntity> findById(@RequestParam long id){
        return dockerDemoRepository.findById(id);
    }
}
