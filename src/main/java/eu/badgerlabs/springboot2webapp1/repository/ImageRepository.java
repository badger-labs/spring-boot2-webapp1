package eu.badgerlabs.springboot2webapp1.repository;

import eu.badgerlabs.springboot2webapp1.model.Image;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface ImageRepository extends ReactiveCrudRepository<Image, String> {

    Mono<Image> findByName(String name);
}
