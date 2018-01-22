package org.zx.learn.service;

import java.util.Map;

import org.zx.learn.dto.AuthDTO;
import org.zx.learn.dto.SysResourceDTO;
import org.zx.learn.dto.UserDTO;
import org.zx.learn.exception.ServiceException;

import java.util.List;

/**
 *
 * @author xiang zeng
 * @date 2017/10/24
 */
public interface UserService {

    /**
     * 根据用户名获取用户授权信息
     * @param accountName
     * @return
     */
    AuthDTO getAuthenticateInfo(String accountName);

    /**
     * 获取所有菜单接口
     * @return
     */
    List<List<SysResourceDTO>>listAllMenu();

    /**
     * 获取用户列表
     * @param paramsMap
     * @return
     */
    List<UserDTO>getAllUser(Map<String, String> paramsMap);

    /**
     * 根据id删除用户
     * @param ids
     * @return
     * @throws ServiceException
     */
    int deleteUserInfoById(List<Integer> ids) throws ServiceException;

    /**
     * 根据用户id获取用户信息
     * @param id
     * @return
     * @throws ServiceException
     */
    UserDTO getUserById(Integer id)  throws ServiceException;

    /**
     * 根据用户认证id获取权限信息
     * @param authId 认证信息id
     * @return 用户权限信息
     * @throws ServiceException 业务层异常
     */
    List<SysResourceDTO> listResourcePermissions(Integer authId) throws ServiceException;

    /**
     * 编辑用户
     * @param userDTO
     * @return
     * @throws ServiceException
     */
    int editUserInfoById(UserDTO userDTO) throws ServiceException;

    /**
     * 新增用户
     * @param userDTO
     * @param authDTO
     * @return
     */
    Map<String, String> addUserInfo(UserDTO userDTO, AuthDTO authDTO);


}
