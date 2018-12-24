package xyz.sunne.wls.system.mapper.system;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import xyz.sunne.wls.system.entity.system.SysResource;

/**
 * @Author Sunne
 * @Date 2018/12/2422:53
 * @Param wls_cloud
 **/
@Mapper
@Repository
public interface SysResourceMapper extends BaseMapper<SysResource> {
}
