package com.example.Sem6DZ.service;


import com.example.Sem6DZ.model.Note;
import com.example.Sem6DZ.repository.NoteRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class NoteService {


    private final NoteRepo repository;


    public List<Note> getAllNote() {
        return repository.findAll();
    }


    public Note getNoteById(Long id) {
        return repository.findById(id).orElseThrow(null);
    }


    public Note updateNote(Note detailsNote) {
        Note note = getNoteById(detailsNote.getId());
        note.setTitle(detailsNote.getTitle());
        note.setContent(detailsNote.getContent());
        return repository.save(note);
    }


    public Note createProduct(Note note) {
        return repository.save(note);
    }


    public void deleteProduct(Long id) {
        repository.deleteById(id);

    }


}
