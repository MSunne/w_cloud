package xyz.sunne.wls.system.entity.system;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import xyz.sunne.wls.system.entity.system.base.BaseEntity;

import java.io.Serializable;

/**
 * @Author Sunne
 * @Date 2018/12/2422:21
 * @Param wls_cloud
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SysRole extends BaseEntity implements Serializable {
    private String name;
    private static final long serialVersionUID = 1L;
}
