package org.zx.learn.service;


import org.zx.learn.dto.AuthDTO;
import org.zx.learn.dto.SysResourceDTO;

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
    List<SysResourceDTO> listAllMenu();


}
