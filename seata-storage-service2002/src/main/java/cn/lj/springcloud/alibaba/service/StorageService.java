package cn.lj.springcloud.alibaba.service;

/**
 * @author llj
 * @date 2021年04月16日 15:47
 */
public interface StorageService {

//    扣减库存
    void decrease(Long productId,Integer count);
}
