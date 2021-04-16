package cn.lj.springcloud.controller;

import cn.lj.springcloud.entities.CommonResult;
import cn.lj.springcloud.entities.Payment;
import cn.lj.springcloud.myhandler.CustomBlockHandler;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author llj
 * @date 2021年04月15日 13:21
 */
@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public CommonResult byResource(){
        return new CommonResult(200,"按资源名称限流OK",new Payment(2020L,"serial001"));
    }

    public CommonResult handleException(BlockException exception) {
        return new CommonResult(495,exception.getClass().getCanonicalName()+"\t 服务不可用");
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl(){
        return new CommonResult(200,"按url限流测试OK",new Payment(200L,"serial002"));
    }

    @GetMapping("/rateLimit/CustomBlockHandler")
    @SentinelResource(value = "CustomBlockHandler",blockHandlerClass = CustomBlockHandler.class,blockHandler = "handlerException2")
    public CommonResult CustomBlockHandler(){
        return new CommonResult(200,"按url限流测试OK",new Payment(200L,"serial002"));
    }

}
