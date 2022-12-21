package com.hzh.liteflowt.controller.base_controller;

import com.yomahub.liteflow.core.FlowExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @NAME: BreakForController
 * @USER: DaHuangGO
 * @DATE: 2022/12/21
 * @TIME: 16:02
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 21
 */
@RestController
@RequestMapping("/breakChain")
public class BreakForController {
    @Autowired
    private FlowExecutor flowExecutor;

    @GetMapping("/breakFor")
    public void breakFor(){
        flowExecutor.execute2Resp("break_chain","args");
    }
}
