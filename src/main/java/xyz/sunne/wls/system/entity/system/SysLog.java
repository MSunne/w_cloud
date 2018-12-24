package xyz.sunne.wls.system.entity.system;

import lombok.Data;
import xyz.sunne.wls.system.entity.system.base.BaseEntity;

import java.io.Serializable;

/**
 * @Author Sunne
 * @Date 2018/12/2422:42
 * @Param wls_cloud
 **/
@Data
public class SysLog extends BaseEntity implements Serializable {
    /**
     * 用户id
     */
    private String uid;
    /**
     * 用户ip
     */
    private String ip;
    /**
     * 是否使用ajax
     */
    private Integer ajax;
    /**
     * 使用的uri
     */
    private String uri;
    /**
     * 提交的参数
     */
    private String params;
    /**
     * 网络求情方式
     */
    private String httpMethod;
    /**
     * 请求的方法
     */
    private String classMethod;
    /**
     * 服务端的执行方法
     */
    private String actionName;
}
