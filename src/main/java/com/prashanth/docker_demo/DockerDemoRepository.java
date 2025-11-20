package com.prashanth.docker_demo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DockerDemoRepository extends JpaRepository<DockerDemoEntity, Long> {
}
