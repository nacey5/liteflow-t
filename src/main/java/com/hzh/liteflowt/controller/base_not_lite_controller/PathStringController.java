package com.hzh.liteflowt.controller.base_not_lite_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @NAME: PathStringController
 * @USER: DaHuangGO
 * @DATE: 2022/12/20
 * @TIME: 22:37
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 20
 */
@RequestMapping("/base")
@RestController
public class PathStringController {

    @GetMapping("/path")
    public String pathString(){
        return "path:success";
    }
}
