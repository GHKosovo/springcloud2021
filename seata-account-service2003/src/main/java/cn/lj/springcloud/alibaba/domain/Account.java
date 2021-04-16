package cn.lj.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author llj
 * @date 2021年04月16日 16:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

//    用户id
    private Long userId;

//    总额度
    private BigDecimal total;

//    已用额度
    private BigDecimal used;

//    剩余额度
    private BigDecimal residue;

}
