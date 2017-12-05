package com.eload.website.service;

import com.eload.pojo.BankInfo;

public interface BankInfoService {
    BankInfo getBankInfoByUid(Long id);

    void saveBankInfo(BankInfo bankInfo);
}
