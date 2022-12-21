package com.hzh.liteflowt.controller.base_controller;

import com.yomahub.liteflow.core.FlowExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @NAME: WhileController
 * @USER: DaHuangGO
 * @DATE: 2022/12/21
 * @TIME: 15:50
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 21
 */
@RestController
@RequestMapping("/whileChain")
public class WhileController {

    @Autowired
    private FlowExecutor flowExecutor;

    @GetMapping("/whileDo")
    public void whileDo(){
        flowExecutor.execute2Resp("while_chain","arg");
    }


}
