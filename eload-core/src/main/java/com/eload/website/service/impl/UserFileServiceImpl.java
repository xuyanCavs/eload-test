package com.eload.website.service.impl;

import com.eload.dao.UserFileMapper;
import com.eload.dao.UserFileTypeMapper;
import com.eload.pojo.LoginInfo;
import com.eload.pojo.UserFile;
import com.eload.pojo.UserFileExample;
import com.eload.util.UserContext;
import com.eload.vo.UserFileType;
import com.eload.website.service.UserFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class UserFileServiceImpl implements UserFileService {

    @Autowired
    private UserFileMapper userFileMapper;

    @Autowired
    private UserFileTypeMapper userFileTypeMapper;

    @Override
    public List<UserFile> getUserFiles(Long id) {
        UserFileExample userFileExample = new UserFileExample();
        UserFileExample.Criteria criteria = userFileExample.createCriteria();
        criteria.andApplierIdEqualTo(id);
        List<UserFile> userFiles = userFileMapper.selectByExample(userFileExample);
        return userFiles;
    }

    @Override
    public List<UserFileType> getUserFilesType(Long id) {
        List<UserFileType> userFileTypes = userFileTypeMapper.selectAll(id);
        return userFileTypes;
    }

    //更新用户更改的信用文件的类型
    @Override
    public void updateType(Long[] id, Long[] fileType) {
        if(id.length!=0&&id!=null&&fileType.length!=0&&fileType!=null){
            for (int i = 0; i < id.length; i++) {
                UserFile userFile = userFileMapper.selectByPrimaryKey(id[i]);
                userFile.setFiletypeId(fileType[i]);
                userFileMapper.updateByPrimaryKey(userFile);
            }
        }
    }

    //存储一次用户信用文件的对象
    @Transactional
    @Override
    public void apply(String fileName, LoginInfo loginInfo) {
        UserFile userFile = new UserFile();
        userFile.setState((byte)0);
        userFile.setApplierId(loginInfo.getId());
        userFile.setFile(fileName);
        userFile.setApplytime(new Date());
        userFile.setScore((byte)0);
        userFileMapper.insert(userFile);
    }
}
