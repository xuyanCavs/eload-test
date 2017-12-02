package com.eload.website.service.impl;

import com.eload.dao.UserFileMapper;
import com.eload.pojo.UserFile;
import com.eload.pojo.UserFileExample;
import com.eload.website.service.UserFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFileServiceImpl implements UserFileService {

    @Autowired
    private UserFileMapper userFileMapper;

    @Override
    public List<UserFile> getUserFiles(Long id) {
        UserFileExample userFileExample = new UserFileExample();
        UserFileExample.Criteria criteria = userFileExample.createCriteria();
        criteria.andApplierIdEqualTo(id);
        List<UserFile> userFiles = userFileMapper.selectByExample(userFileExample);
        return userFiles;
    }

    @Override
    public void apply(String fileName) {
        
    }
}
