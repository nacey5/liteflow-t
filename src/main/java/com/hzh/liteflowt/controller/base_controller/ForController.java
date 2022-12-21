package com.hzh.liteflowt.controller.base_controller;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @NAME: ForController
 * @USER: DaHuangGO
 * @DATE: 2022/12/21
 * @TIME: 15:38
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 21
 */

@RestController
@RequestMapping("/for_chain")
public class ForController {

    @Autowired
    private FlowExecutor flowExecutor;

    @GetMapping("/forChainBase")
    public void forChainBase(){
        LiteflowResponse response = flowExecutor.execute2Resp("for_do_chain", "arg");
    }
}
