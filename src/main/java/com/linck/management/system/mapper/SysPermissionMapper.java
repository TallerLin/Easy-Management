package com.linck.management.system.mapper;

import com.linck.management.system.entity.SysPermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author linck
 * @since 2020-08-09
 */
public interface SysPermissionMapper extends BaseMapper<SysPermission> {
    /**
     * 根据UserId查询所有启用状态权限
     * @param id
     * @return
     */
    List<SysPermission> listByUserId(Long id);
}
