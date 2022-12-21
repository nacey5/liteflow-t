package com.hzh.liteflowt.controller.base_controller;

import com.yomahub.liteflow.core.FlowExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @NAME: WhenController
 * @USER: DaHuangGO
 * @DATE: 2022/12/21
 * @TIME: 16:17
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 21
 */
@RestController
@RequestMapping("/whenChain")
public class WhenController {

    @Autowired
    private FlowExecutor flowExecutor;

    @GetMapping("/whenExec")
    public void whenExec(){
        flowExecutor.execute2Resp("when_chain_1","args");
    }

    @GetMapping("/ignoreEx")
    public void ignoreEx(){
        flowExecutor.execute2Resp("when_chain_4","args");
    }

    @GetMapping("/angWhen")
    public void anyWhenGo(){
        flowExecutor.execute2Resp("when_any_chain","args");
    }
}
