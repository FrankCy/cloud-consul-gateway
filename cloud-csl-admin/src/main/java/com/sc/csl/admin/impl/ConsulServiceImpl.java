package com.sc.csl.admin.impl;

import com.sc.csl.admin.services.ConsulService;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.csl.admin.impl、
 * @email: cy880708@163.com
 * @date: 2019/1/8 下午5:02
 * @mofified By:
 */
@Service
public class ConsulServiceImpl implements ConsulService {

    @Override
    public String getString() {
        return "Hello ABCD";
    }
}
