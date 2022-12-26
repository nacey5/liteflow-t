package com.hzh.liteflowt.controller.base_controller;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @NAME: ComplexController
 * @USER: DaHuangGO
 * @DATE: 2022/12/21
 * @TIME: 17:31
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 21
 */
@RestController
@RequestMapping("/complex")
public class ComplexController {
    @Autowired
    private FlowExecutor flowExecutor;

    @GetMapping("/cx_chain1")
    public void cxChainExec1(){
        flowExecutor.execute2Resp("cx_chain1","arg");
    }

    @GetMapping("/cx_chain2")
    public void cxChainExec2(){
        flowExecutor.execute2Resp("cx_chain2","arg");
    }

    @GetMapping("/sub_chain1")
    public void subChainExec1(){
        flowExecutor.execute2Resp("Au1_mainChain","arg");
    }

    @GetMapping("/sub_chain2")
    public void subChainExec2(){
        flowExecutor.execute2Resp("Au2_mainChain","arg");
    }

    @GetMapping("/sub_comp_chain2")
    public void subChainCmpExec2(){
        LiteflowResponse response = flowExecutor.execute2Resp("example_sub_chain2", "arg");
        if (response.isSuccess()) {
            System.out.println("||-------------------------------||");
            System.out.println(response.getMessage());
            System.out.println(response.getCause());
            System.out.println(response.getCode());
            System.out.println(response.getRequestId());
            System.out.println(response.getSlot());
            System.out.println(response.getExecuteStepStrWithTime());
            System.out.println(response.getExecuteStepStrWithoutTime());
            System.out.println("||-------------------------------||");
        }
    }

    @GetMapping("/sub_comp_chain1")
    public void thread_chain1(){
        flowExecutor.execute2Future("pri_submit_chain1","arg");
    }
}
