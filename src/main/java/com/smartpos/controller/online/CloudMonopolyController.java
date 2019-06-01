package com.smartpos.controller.online;


import com.smartpos.annotations.ApiRestAction;
import com.smartpos.model.cloudmonopoly.BatchSaveBranchModel;
import com.smartpos.model.cloudmonopoly.DeleteBranchModel;
import com.smartpos.model.cloudmonopoly.ListBranchesModel;
import com.smartpos.service.online.CloudMonopolyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuyandong on 2019-05-15.
 */
@Controller
@RequestMapping(value = "/cloudMonopoly")
public class CloudMonopolyController {
    /**
     * 批量保存门店信息
     *
     * @return
     */
    @RequestMapping(value = "/batchSaveBranch", method = RequestMethod.POST)
    @ResponseBody
    @ApiRestAction(modelClass = BatchSaveBranchModel.class, serviceClass = CloudMonopolyService.class, serviceMethodName = "batchSaveBranch", error = "保存门店信息失败")
    public String batchSaveBranch() {
        return null;
    }

    /**
     * 查询门店信息
     *
     * @return
     */
    @RequestMapping(value = "/listBranches", method = RequestMethod.GET)
    @ResponseBody
    @ApiRestAction(modelClass = ListBranchesModel.class, serviceClass = CloudMonopolyService.class, serviceMethodName = "listBranches", error = "查询门店信息失败")
    public String listBranches() {
        return null;
    }

    /**
     * 删除门店信息
     *
     * @return
     */
    @RequestMapping(value = "/deleteBranch", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    @ApiRestAction(modelClass = DeleteBranchModel.class, serviceClass = CloudMonopolyService.class, serviceMethodName = "deleteBranch", error = "删除门店信息失败")
    public String deleteBranch() {
        return null;
    }
}
