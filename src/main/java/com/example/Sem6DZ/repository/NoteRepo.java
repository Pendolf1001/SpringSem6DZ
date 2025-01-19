package com.example.Sem6DZ.repository;

import com.example.Sem6DZ.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NoteRepo extends JpaRepository<Note, Long> {
}
