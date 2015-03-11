/*
 * This is free and unencumbered software released into the public domain.
 */
package org.wicketsample;

import org.apache.log4j.Logger;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.Link;

import javax.servlet.http.HttpServletRequest;

/**
 * Base class for MyFortressProject.
 *
 * @author Shawn McKinney
 * @version $Rev$
 */
public abstract class MyBasePage extends WebPage
{
    //@SpringBean
    //private AccessMgr accessMgr;

    private static final Logger LOG = Logger.getLogger( MyBasePage.class.getName() );

    public MyBasePage()
    {
        //SecureBookmarkablePageLink page1Link = new SecureBookmarkablePageLink( "page1", Page1.class, "ROLE_TEST1" );
        BookmarkablePageLink page1Link = new BookmarkablePageLink( "page1", Page1.class );
        add( page1Link );
        BookmarkablePageLink page2Link = new BookmarkablePageLink( "page2", Page2.class );
        add( page2Link );
        BookmarkablePageLink page3Link = new BookmarkablePageLink( "page3", Page3.class );
        add( page3Link );
        final Link actionLink = new Link( "logout" )
        {
            @Override
            public void onClick()
            {
                HttpServletRequest servletReq = ( HttpServletRequest ) getRequest().getContainerRequest();
                servletReq.getSession().invalidate();
                getSession().invalidate();
                setResponsePage(LoginPage.class);
            }
        };
        add( actionLink );
        add( new Label( "footer", "This is free and unencumbered software released into the public domain." ) );
        //HttpServletRequest servletReq = ( HttpServletRequest ) getRequest().getContainerRequest();
        //Principal principal = servletReq.getUserPrincipal();
        //boolean isLoggedIn = principal != null;

        // Is this a Java EE secured page && has the User successfully authenticated already?
        //if ( isLoggedIn )
        //{
            // TODO: make sure this is necessary:
        //    synchronized ( ( RbacSession ) RbacSession.get() )
        //    {
        //        if ( GlobalUtils.getRbacSession( this ) == null )
        //        {
        //            try
        //            {
        //                // Create an RBAC session and attach to Wicket session:
        //                Session session = accessMgr.createSession( new User( principal.getName() ), true );
        //                String message = "RBAC Session successfully created for userId: " + session.getUserId();
        //                ( ( RbacSession ) RbacSession.get() ).setSession( session );
        //                List<Permission> permissions = accessMgr.sessionPermissions( session );
        //                ( ( RbacSession ) RbacSession.get() ).setPermissions( permissions );
        //                LOG.debug( message );
        //            }
        //            catch ( org.apache.directory.fortress.core.SecurityException se )
        //            {
        //                String error = "caught SecurityException=" + se;
        //                LOG.error( error );
        //                throw new RuntimeException( error );
        //            }
        //        }
        //    }
        //}
        //else
        //{
        //    actionLink.setVisible( false );
        //}
    }
}