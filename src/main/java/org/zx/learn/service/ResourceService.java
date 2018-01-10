package org.zx.learn.service;

import org.zx.learn.dto.SysResourceDTO;
import org.zx.learn.exception.ServiceException;

import java.util.List;

public interface ResourceService {
    /**
     * 查询所有的顶级资源
     * @return
     */
    List<SysResourceDTO> listTopResource() throws ServiceException;

    /**
     * 根据父资源查询所有子资源
     * @param parentId
     * @return
     */
    List<SysResourceDTO> listResourceByParent(Integer parentId) throws ServiceException;

    /**
     * 修改资源
     * @param sysResourceDTO
     * @return
     */
    int updateResource(SysResourceDTO sysResourceDTO) throws ServiceException;

    /**
     * 增加子资源
     * @param sysResourceDTO
     * @return
     */
    int saveResource(SysResourceDTO sysResourceDTO) throws ServiceException;

    /**
     * 删除资源
     * @param ids 需要删除的ids列表
     * @return 更新的行数
     * @throws ServiceException
     * @see org.zx.learn.exception.ExceptionMsg;
     */
    int deleteResource(List<Integer> ids) throws ServiceException;


}
