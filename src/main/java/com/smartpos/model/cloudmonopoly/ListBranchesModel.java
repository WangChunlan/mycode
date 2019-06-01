package com.smartpos.model.cloudmonopoly;

import com.smartpos.util.BasicModel;


import javax.validation.constraints.NotNull;
import java.math.BigInteger;

/**
 * Created by liuyandong on 2019-05-20.
 */
public class ListBranchesModel extends BasicModel {
    @NotNull
    private BigInteger tenantId;

    public BigInteger getTenantId() {
        return tenantId;
    }

    public void setTenantId(BigInteger tenantId) {
        this.tenantId = tenantId;
    }
}
