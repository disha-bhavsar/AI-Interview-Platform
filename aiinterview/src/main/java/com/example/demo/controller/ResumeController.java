package com.example.demo.controller;

import com.example.demo.model.Resume;
import com.example.demo.repository.ResumeRepository;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/resume")
@CrossOrigin("*")

public class ResumeController {

    private final ResumeRepository resumeRepository;

    public ResumeController(
            ResumeRepository resumeRepository) {

        this.resumeRepository = resumeRepository;
    }

    @PostMapping("/upload")

    public Resume uploadResume(
            @RequestParam("file")
            MultipartFile file)
            throws IOException {

        File tempFile =
        File.createTempFile("resume", ".pdf");

        file.transferTo(tempFile);

        PDDocument document =
        PDDocument.load(tempFile);

        PDFTextStripper stripper =
        new PDFTextStripper();

        String content =
        stripper.getText(document);

        document.close();

        String feedback =
        analyzeResume(content);

        Resume resume =
        new Resume(
                file.getOriginalFilename(),
                content,
                feedback
        );

        return resumeRepository.save(resume);
    }

    private String analyzeResume(
            String content) {

        content = content.toLowerCase();

        if(content.contains("java") &&
           content.contains("sql") &&
           content.contains("project")) {

            return "Strong Technical Resume";
        }

        else if(content.contains("html") ||
                content.contains("css")) {

            return "Good For Frontend Roles";
        }

        else {

            return "Need More Technical Skills";
        }
    }
}