package xyz.sunne.wls.system.entity.system;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import xyz.sunne.wls.system.entity.system.base.BaseEntity;

import java.io.Serializable;

/**
 * @Author Sunne
 * @Date 2018/12/2422:30
 * @Param wls_cloud
 **/
@Data
public class Protocol extends BaseEntity implements Serializable {
    @ApiModelProperty("协议名称")
    private String name;
    @ApiModelProperty("协议主体内容")
    private String body;
}
