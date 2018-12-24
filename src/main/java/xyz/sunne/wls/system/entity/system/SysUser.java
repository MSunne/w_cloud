package xyz.sunne.wls.system.entity.system;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import xyz.sunne.wls.system.entity.system.base.BaseEntity;

import java.util.Date;

/**
 * @Author Sunne
 * @Date 2018/12/2422:08
 * @Param wls_cloud
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SysUser extends BaseEntity {

    private String username;
    private Integer age;
    private String password;
}
