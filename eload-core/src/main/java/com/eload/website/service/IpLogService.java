package com.eload.website.service;

import com.eload.query.IplogQueryObject;
import com.eload.query.PageResult;


public interface IpLogService {
    PageResult fingIpLog(IplogQueryObject qo);
}
