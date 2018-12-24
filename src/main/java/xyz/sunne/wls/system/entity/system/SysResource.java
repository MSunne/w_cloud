package xyz.sunne.wls.system.entity.system;

import com.baomidou.mybatisplus.annotations.TableField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import xyz.sunne.wls.system.entity.system.base.BaseEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author Sunne
 * @Date 2018/12/2422:24
 * @Param wls_cloud
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysResource extends BaseEntity implements Serializable {
    /**
     * 父级Id
     */
    private String parentId;

    private Short type;
    /**
     * 有权使用的链接
     */
    private String url;

    private String color;

    private String icon;

    private Boolean verification;
    @TableField(exist = false)
    private List<Protocol> protocols;
    @TableField(exist = false)
    private List<SysResource> children;
}
