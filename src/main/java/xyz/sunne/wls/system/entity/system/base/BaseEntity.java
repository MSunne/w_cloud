package xyz.sunne.wls.system.entity.system.base;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @Author Sunne
 * @Date 2018/12/2422:11
 * @Param wls_cloud
 * 基础实体，所有的entity都必须继承改实体
 **/
@Data
public class BaseEntity {
    @TableId
    private String id;
    /**
     * 数据创建时间
     */
    private Date createDate;
    /**
     * 数据创建时间
     */
    private Date update;
    /**
     *     数据是否可用
     */
    private Integer status;
    /**
     * 修改数据的用户
     */
    private Integer upUser;
    /**
     * 创建数据的用户
     */
    private Integer createUser;

}
