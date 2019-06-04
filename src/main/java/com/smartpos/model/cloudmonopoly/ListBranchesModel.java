package com.smartpos.model.cloudmonopoly;

import com.smartpos.utils.BasicModel;


import javax.validation.constraints.NotNull;
import java.math.BigInteger;


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
