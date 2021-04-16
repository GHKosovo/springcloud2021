package cn.lj.springcloud.alibaba.service.impl;

import cn.lj.springcloud.alibaba.dao.StorageDao;
import cn.lj.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author llj
 * @date 2021年04月16日 15:48
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------storage-service钟扣减库存开始");
        storageDao.decrease(productId,count);
        log.info("------storage-service钟扣减库存结束");
    }
}
