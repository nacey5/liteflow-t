package com.hzh.liteflowt.controller.base_controller;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @NAME: chain1Controller
 * @USER: DaHuangGO
 * @DATE: 2022/12/20
 * @TIME: 23:05
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 20
 */
@RestController
@RequestMapping("/chain1")
public class Chain1Controller {

    @Autowired
    private FlowExecutor flowExecutor;

    @GetMapping("/thenABC")
    public void execute2Resp(){
        LiteflowResponse response = flowExecutor.execute2Resp("chain1", "arg");
    }
}
