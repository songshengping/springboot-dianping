package com.song.springboot.shiro.config.shiro;

import com.song.springboot.shiro.mapper.DpUserMapper;
import com.song.springboot.shiro.model.DpMenu;
import com.song.springboot.shiro.model.DpRole;
import com.song.springboot.shiro.model.DpUser;
import com.song.springboot.shiro.utils.ValidataUtil;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description 自定义的身份认证Realm
 * @Date 2020/11/15 16:20
 * @Created by Jeremy
 */
public class DpShiroRealm extends AuthorizingRealm {

    @Autowired
    public DpUserMapper userMapper;

    /**
     * 授权方法:主要用于获取角色的菜单权限
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        DpUser user = (DpUser)principalCollection.getPrimaryPrincipal();
        for (DpRole role : user.getRoleList()) {
            simpleAuthorizationInfo.addRole(role.getName());
            for (DpMenu menu : role.getMenuList()) {
                simpleAuthorizationInfo.addStringPermission(menu.getName());
            }
        }
        return simpleAuthorizationInfo;
    }

    /**
     * 认证方法:主要用于校验用户名和密码
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String)token.getPrincipal();
        // 根据用户名获取用户信息
        List<DpUser> userList = userMapper.findUserByUsername(username);
        if (ValidataUtil.isNullOrBlank(userList)) {
            return null;
        }
        // 校验用户名密码是否正确
        DpUser user = userList.iterator().next();
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user, user.getPassword(), getName());
        return authenticationInfo;
    }
}
