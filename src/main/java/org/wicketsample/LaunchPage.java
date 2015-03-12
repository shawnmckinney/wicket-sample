/*
 * This is free and unencumbered software released into the public domain.
 */
package org.wicketsample;


import org.apache.log4j.Logger;
import org.apache.wicket.markup.html.basic.Label;

/**
 * This Wicket Sample routes traffic here.  It displays list of page links at the top.
 *
 * @author Shawn McKinney
 * @version $Rev$
 */
public class LaunchPage extends WicketSampleBasePage
{
    private static final Logger LOG = Logger.getLogger( LaunchPage.class.getName() );
    public LaunchPage()
    {
/*
        // TODO: uncomment to enable Java EE logon/logoff page flow:s
        HttpServletRequest servletReq = (HttpServletRequest)getRequest().getContainerRequest();
        Principal principal = servletReq.getUserPrincipal();
        // needed anytime container security checker allows requests in with old cookie (perhaps after server/app restart)::
        if(principal == null)
        {
            LOG.info( "user not logged in, route to login page instead" );
            // invalidate the session and force the user to log back on:
            servletReq.getSession().invalidate();
            getSession().invalidate();
            setResponsePage( LogoutPage.class );
        }
*/
        add(new Label("label1", "You have access to the link(s) above."));
    }
}