package com.eload.website.service;

import com.eload.pojo.UserFile;

import java.util.List;

public interface UserFileService {
    List<UserFile> getUserFiles(Long id);
}
