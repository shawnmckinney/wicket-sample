/*
 * © 2023 iamfortress.net
 */
package org.wicketsample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.Link;
import javax.servlet.http.HttpServletRequest;

/*
import org.apache.directory.fortress.web.control.FtBookmarkablePageLink;
import org.apache.directory.fortress.web.control.SecUtils;
import org.apache.directory.fortress.core.AccessMgr;
import org.apache.directory.fortress.realm.J2eePolicyMgr;
import org.apache.wicket.spring.injection.annot.SpringBean;
*/


/**
 * Base class for wicketsample project.
 *
 * @author Shawn McKinney
 * @version $Rev$
 */
public abstract class WicketSampleBasePage extends WebPage
{
    // TODO STEP: enable spring injection of fortress bean here:
/*
    @SpringBean
    private AccessMgr accessMgr;
    @SpringBean
    private J2eePolicyMgr j2eePolicyMgr;
*/

    public WicketSampleBasePage()
    {
        // TODO STEP: uncomment call to enableFortress:
/*
        try
        {
            SecUtils.enableFortress( this, ( HttpServletRequest ) getRequest().getContainerRequest(), j2eePolicyMgr,
                accessMgr );
        }
        catch (org.apache.directory.fortress.core.SecurityException se)
        {
            String error = "WicketSampleBasePage caught security exception : " + se;
            LOG.warn( error );
        }
*/
        // TODO STEP: change to FtBookmarkablePageLink:
        add( new BookmarkablePageLink( "wspage1.link", Page1.class ) );
        add( new BookmarkablePageLink( "wspage2.link", Page2.class ) );
        add( new BookmarkablePageLink( "wspage3.link", Page3.class ) );
        final Link actionLink = new Link( "logout.link" )
        {
            @Override
            public void onClick()
            {
                setResponsePage(LogoutPage.class);
            }
        };
        add( actionLink );
        add( new Label( "footer", "© 2023 iamfortress.net" ) );
    }

    /**
     * Used by the child pages.
     *
     * @param target for modal panel
     * @param msg to log and display user info
     */
    protected void logIt(AjaxRequestTarget target, String msg)
    {
        info( msg );
        LOG.info( msg );
        target.appendJavaScript(";alert('" + msg + "');");
    }

    protected static final Logger LOG = LoggerFactory.getLogger( WicketSampleBasePage.class.getName() );
}
