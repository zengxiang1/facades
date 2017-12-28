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

    int deleteUserInfoById(List<Integer> ids) throws ServiceException;

    int editUserInfoById(UserDTO userDTO) throws ServiceException;

    Map<String, String> addUserInfo(UserDTO userDTO, AuthDTO authDTO);
}
