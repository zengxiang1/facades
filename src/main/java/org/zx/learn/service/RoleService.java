package org.zx.learn.service;

import java.util.List;
import org.zx.learn.dto.SysRoleDTO;
import org.zx.learn.exception.ServiceException;

/**
 * Created by xiang zeng on 2017/10/28.
 *
 * @author xiang zeng
 */
public interface RoleService {

    /**
     * 获取所有角色
     * @return
     */
    List<SysRoleDTO> listAllRole () throws ServiceException;

    /**
     * 根据id获取角色信息
     * @return
     */
    SysRoleDTO getRoleById();

    /**
     * 更新角色信息
     * @param sysRoleDTO
     */
    void updateRole(SysRoleDTO sysRoleDTO);

    /**
     * 根据角色id删除角色
     * @param ids id列表
     * @throws ServiceException 服务层异常
     */
    int deleteRoleById(List<Integer> ids) throws ServiceException;

    /**
     * 查询所有顶级角色
     * @return 所有最高角色list
     * @throws ServiceException 服务层异常
     */
    List<SysRoleDTO> listTopRole() throws ServiceException;

    /**
     * 根据父角色id查询所有角色
     * @param parentId 父角色id
     * @return 所有的子角色集合
     * @throws ServiceException 服务层异常
     */
    List<SysRoleDTO> listRoleByParent(Integer parentId) throws ServiceException;

    /**
     * 保存角色
     * @param sysRoleDTO 需要保存的角色
     * @return 更新的数据库行数
     * @throws ServiceException 服务层异常
     */
    int saveSysRole(SysRoleDTO sysRoleDTO) throws ServiceException;

    /**
     * 修改角色
     * @param sysRoleDTO 更新实体类
     * @return 更新的行数
     * @throws ServiceException 服务层异常
     */
    int updateSysRole(SysRoleDTO sysRoleDTO) throws ServiceException;

}
