package com.eload.website.service.impl;

import com.eload.dao.BankInfoMapper;
import com.eload.pojo.BankInfo;
import com.eload.pojo.BankInfoExample;
import com.eload.website.service.BankInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BankInfoServiceImpl implements BankInfoService {

    @Autowired
    private BankInfoMapper bankInfoMapper;

    @Transactional
    @Override
    public void saveBankInfo(BankInfo bankInfo) {
        bankInfoMapper.insert(bankInfo);
    }

    @Override
    public BankInfo getBankInfoByUid(Long id) {
        BankInfoExample bankInfoExample = new BankInfoExample();
        BankInfoExample.Criteria criteria = bankInfoExample.createCriteria();
        criteria.andUidEqualTo(Integer.parseInt(id+""));
        List<BankInfo> bankInfos = bankInfoMapper.selectByExample(bankInfoExample);
        if (bankInfos!=null&&bankInfos.size()!=0){
            return bankInfos.get(0);
        }
        return null;
    }
}
