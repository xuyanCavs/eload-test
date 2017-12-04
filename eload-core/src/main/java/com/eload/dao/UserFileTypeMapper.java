package com.eload.dao;

import com.eload.vo.UserFileType;

import java.util.List;

public interface UserFileTypeMapper {
    List<UserFileType> selectAll(Long id);
}
