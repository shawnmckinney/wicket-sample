/*
 * This is free and unencumbered software released into the public domain.
 */
package com.mycompany;

import org.apache.log4j.Logger;
import org.apache.wicket.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * ...
 *
 * @author Shawn McKinney
 * @version $Rev$
 */
public class GlobalUtils
{
    private static final Logger LOG = Logger.getLogger( GlobalUtils.class.getName() );
    public static final String WINDOW_LOCATION_REPLACE_LOGIN_LOGIN_HTML = "window.location.replace(\"/login/login.html\");";

    public static final String BUTTON1 = "Button1";
    public static final String BUTTON2 = "Button2";
    public static final String BUTTON3 = "Button3";

/*
    public static Session getRbacSession( Component component )
    {
        return ( ( RbacSession ) component.getSession() ).getRbacSession();
    }

    public static List<Permission> getRbacPermissions( Component component )
    {
        return ( ( RbacSession ) component.getSession() ).getPermissions();
    }

    public static boolean isAuthorized( String roleName, HttpServletRequest servletReq )
    {
        boolean isAuthorized = false;
        if ( servletReq.isUserInRole( roleName ) )
        {
            isAuthorized = true;
        }
        return isAuthorized;
    }

    public static boolean isFound( Permission permission, Component component )
    {
        List<Permission> permissions = GlobalUtils.getRbacPermissions( component );
        return VUtil.isNotNullOrEmpty( permissions ) && permissions.contains( permission );
    }
*/
}
