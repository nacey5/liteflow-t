package com.hzh.liteflowt.controller.base_controller;

import com.hzh.liteflowt.context.OrderContext;
import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.slot.DefaultContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @NAME: PreController
 * @USER: DaHuangGO
 * @DATE: 2022/12/22
 * @TIME: 13:36
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 22
 */
@RestController
@RequestMapping("/preAndAfter")
public class PreAndAfterController {
    @Autowired
    private FlowExecutor flowExecutor;

    @GetMapping("/preExec1")
    public void preExec1(){
        flowExecutor.execute2Resp("pre_chain1","arg", OrderContext.class);
    }

    @GetMapping("/afterExec1")
    public void afterExec1(){
        flowExecutor.execute2Resp("after_chain1","arg", OrderContext.class);
    }
    @GetMapping("/preAfterExec1")
    public void preAfterExec1(){
        flowExecutor.execute2Resp("pre_and_after_example_chain","arg", OrderContext.class);
    }

    @GetMapping("/subCmpExec1")
    public void subCmpExec1(){
        flowExecutor.execute2Resp("sub_chain_index1","arg", OrderContext.class);
    }

    @GetMapping("/dataCmpExec1")
    public void dataCmpExec1(){
        flowExecutor.execute2Resp("data_chain1","arg", OrderContext.class);
    }

    @GetMapping("/priSubmitCmpExec1")
    public void priSubmitCmpExec1(){
        flowExecutor.execute2Resp("pri_submit_chain1","arg", DefaultContext.class);
    }
}
