package com.github.contribute.service;

import com.github.contribute.model.FileChange;
import com.github.contribute.repository.FileChangeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileChangeService {

    public final FileChangeRepository fileChangeRepository;


    public FileChangeService(FileChangeRepository fileChangeRepository) {
        this.fileChangeRepository = fileChangeRepository;
    }

    public FileChange saveFileChange(FileChange fileChange)
        {
            return fileChangeRepository.save(fileChange);
        }

    public List<FileChange> getByCommitId(String commitId)
    {
        return fileChangeRepository.findByCommitId(commitId);
    }

}
