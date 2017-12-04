package com.eload.website.service;

import com.eload.pojo.LoginInfo;
import com.eload.pojo.UserFile;
import com.eload.vo.UserFileType;

import java.util.List;

public interface UserFileService {
    List<UserFile> getUserFiles(Long id);

    void apply(String fileName, LoginInfo loginInfo);

    List<UserFileType> getUserFilesType(Long id);

    void updateType(Long[] id, Long[] fileType);
}
