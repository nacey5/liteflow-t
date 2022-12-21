package com.hzh.liteflowt.controller.base_controller;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @NAME: SwitchChainController
 * @USER: DaHuangGO
 * @DATE: 2022/12/21
 * @TIME: 2:11
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 21
 */

@RestController
@RequestMapping("/switch_chain")
public class SwitchChainController {

    @Autowired
    private FlowExecutor flowExecutor;

    @GetMapping("/switchABC")
    public void switchNode(){
        LiteflowResponse response = flowExecutor.execute2Resp("switch_chain", "arg");
    }

    @GetMapping("/switchById")
    public void switchNodeById(){
        LiteflowResponse response = flowExecutor.execute2Resp("switch_chain_by_id", "arg");
    }

    @GetMapping("/switchByTag")
    public void switchNodeByTag(){
        LiteflowResponse response = flowExecutor.execute2Resp("switch_chain_by_tag", "arg");
    }

    @GetMapping("/switchThen")
    public void switchNodeThen(){
        LiteflowResponse response = flowExecutor.execute2Resp("then_switch_chain", "arg");
    }

    @GetMapping("/switchDefault")
    public void switchDefault(){
        LiteflowResponse response = flowExecutor.execute2Resp("switch_chain_default", "arg");
    }
}
