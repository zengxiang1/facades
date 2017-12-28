package org.zx.learn.service;

import org.zx.learn.exception.ServiceException;

public interface AuthService {

    int checkAuth(String authName) throws ServiceException;
}
