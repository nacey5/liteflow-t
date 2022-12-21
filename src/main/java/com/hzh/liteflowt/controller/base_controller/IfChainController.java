package com.hzh.liteflowt.controller.base_controller;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @NAME: IfChainController
 * @USER: DaHuangGO
 * @DATE: 2022/12/21
 * @TIME: 15:16
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 21
 */
@RestController
@RequestMapping("/ifChain")
public class IfChainController {

    @Autowired
    private FlowExecutor flowExecutor;

    @GetMapping("/ifx2AB")
    public void baseIf(){
        LiteflowResponse response = flowExecutor.execute2Resp("if_chain", "args");
    }

    @GetMapping("/if2el")
    public void if2el(){
        flowExecutor.execute2Resp("if_not_elif_chain","ars");
    }
}
