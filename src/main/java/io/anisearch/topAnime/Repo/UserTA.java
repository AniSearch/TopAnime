package io.anisearch.topAnime.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import io.anisearch.topAnime.model.topanime;

public interface UserTA extends JpaRepository<topanime, Long> {

}
