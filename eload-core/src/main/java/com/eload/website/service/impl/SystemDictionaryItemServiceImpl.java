package com.eload.website.service.impl;

import com.eload.dao.SystemDictionaryItemMapper;
import com.eload.pojo.SystemDictionaryItem;
import com.eload.pojo.SystemDictionaryItemExample;
import com.eload.website.service.SystemDictionaryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemDictionaryItemServiceImpl implements SystemDictionaryItemService {

    @Autowired
    private SystemDictionaryItemMapper systemDictionaryItemMapper;

    @Override
    public List<SystemDictionaryItem> getUserFileInfo() {
        SystemDictionaryItemExample systemDictionaryItemExample = new SystemDictionaryItemExample();
        SystemDictionaryItemExample.Criteria criteria = systemDictionaryItemExample.createCriteria();
        criteria.andParentidEqualTo(6L);
        List<SystemDictionaryItem> systemDictionaryItems = systemDictionaryItemMapper.selectByExample(systemDictionaryItemExample);
        return systemDictionaryItems;
    }
}
